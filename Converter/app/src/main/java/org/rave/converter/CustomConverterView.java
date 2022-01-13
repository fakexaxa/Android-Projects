package org.rave.converter;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import org.rave.converter.databinding.CustomConverterBinding;

import java.util.Objects;
import java.util.function.Consumer;

public class CustomConverterView extends LinearLayout {

    private CustomConverterBinding binding;

    public CustomConverterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomConverterView, 0, 0);
        String label = a.getString(R.styleable.CustomConverterView_label);
        String displayHint = a.getString(R.styleable.CustomConverterView_displayHint);
        a.recycle();

        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        binding = CustomConverterBinding.inflate(inflater, this, true);
        binding.tilInputField.setHint(label);
        binding.tvDisplay.setHint(displayHint);
    }

    public CustomConverterView(Context context) {
        super(context, null);
    }

    public void updateDisplay(String value) {
        binding.tvDisplay.setText(value);
    }

    /**
     * This method listens to the [TextInputLayout] and updates the caller when text changes
     *
     * @param lambda Callback to receive to text change updates
     */
    public void listenToTextChange(Consumer<CharSequence> lambda) {
        Objects.requireNonNull(binding.tilInputField.getEditText()).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                lambda.accept(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

}
