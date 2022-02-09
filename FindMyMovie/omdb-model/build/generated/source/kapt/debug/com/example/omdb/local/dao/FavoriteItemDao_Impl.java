package com.example.omdb.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.omdb.response.FavoriteMediaItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteItemDao_Impl implements FavoriteItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteMediaItem> __insertionAdapterOfFavoriteMediaItem;

  private final EntityDeletionOrUpdateAdapter<FavoriteMediaItem> __deletionAdapterOfFavoriteMediaItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMediaItems;

  private final SharedSQLiteStatement __preparedStmtOfDeleteItem;

  public FavoriteItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteMediaItem = new EntityInsertionAdapter<FavoriteMediaItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_list` (`title`,`year`,`imdb_id`,`type`,`poster`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteMediaItem value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getYear());
        }
        if (value.getImdbID() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImdbID());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPoster());
        }
      }
    };
    this.__deletionAdapterOfFavoriteMediaItem = new EntityDeletionOrUpdateAdapter<FavoriteMediaItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorite_list` WHERE `imdb_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteMediaItem value) {
        if (value.getImdbID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImdbID());
        }
      }
    };
    this.__preparedStmtOfDeleteMediaItems = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM favorite_list";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM favorite_list WHERE imdb_id=?";
        return _query;
      }
    };
  }

  @Override
  public Object insertItem(final FavoriteMediaItem item,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteMediaItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final FavoriteMediaItem user,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoriteMediaItem.handle(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteMediaItems() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMediaItems.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMediaItems.release(_stmt);
    }
  }

  @Override
  public Object deleteAllFavMediaItems(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMediaItems.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteMediaItems.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteItem(final String id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteItem.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteItem.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<FavoriteMediaItem>> getAll() {
    final String _sql = "SELECT * FROM favorite_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"favorite_list"}, new Callable<List<FavoriteMediaItem>>() {
      @Override
      public List<FavoriteMediaItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfImdbID = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final List<FavoriteMediaItem> _result = new ArrayList<FavoriteMediaItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavoriteMediaItem _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpImdbID;
            if (_cursor.isNull(_cursorIndexOfImdbID)) {
              _tmpImdbID = null;
            } else {
              _tmpImdbID = _cursor.getString(_cursorIndexOfImdbID);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            _item = new FavoriteMediaItem(_tmpTitle,_tmpYear,_tmpImdbID,_tmpType,_tmpPoster);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getMediaItem(final String id,
      final Continuation<? super FavoriteMediaItem> continuation) {
    final String _sql = "SELECT Title,Year,imdb_id,Type,Poster FROM media_item WHERE imdb_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<FavoriteMediaItem>() {
      @Override
      public FavoriteMediaItem call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = 0;
          final int _cursorIndexOfYear = 1;
          final int _cursorIndexOfImdbID = 2;
          final int _cursorIndexOfType = 3;
          final int _cursorIndexOfPoster = 4;
          final FavoriteMediaItem _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpImdbID;
            if (_cursor.isNull(_cursorIndexOfImdbID)) {
              _tmpImdbID = null;
            } else {
              _tmpImdbID = _cursor.getString(_cursorIndexOfImdbID);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            _result = new FavoriteMediaItem(_tmpTitle,_tmpYear,_tmpImdbID,_tmpType,_tmpPoster);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
