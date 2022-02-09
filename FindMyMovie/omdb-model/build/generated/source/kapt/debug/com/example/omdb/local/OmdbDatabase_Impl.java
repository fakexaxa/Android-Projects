package com.example.omdb.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.omdb.local.dao.FavoriteItemDao;
import com.example.omdb.local.dao.FavoriteItemDao_Impl;
import com.example.omdb.local.dao.MediaItemDao;
import com.example.omdb.local.dao.MediaItemDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OmdbDatabase_Impl extends OmdbDatabase {
  private volatile MediaItemDao _mediaItemDao;

  private volatile FavoriteItemDao _favoriteItemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `media_item` (`title` TEXT NOT NULL, `year` TEXT NOT NULL, `imdb_id` TEXT NOT NULL, `type` TEXT NOT NULL, `poster` TEXT NOT NULL, PRIMARY KEY(`imdb_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_list` (`title` TEXT NOT NULL, `year` TEXT NOT NULL, `imdb_id` TEXT NOT NULL, `type` TEXT NOT NULL, `poster` TEXT NOT NULL, PRIMARY KEY(`imdb_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4562145591a386d2e232121aa8887d13')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `media_item`");
        _db.execSQL("DROP TABLE IF EXISTS `favorite_list`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMediaItem = new HashMap<String, TableInfo.Column>(5);
        _columnsMediaItem.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaItem.put("year", new TableInfo.Column("year", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaItem.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaItem.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaItem.put("poster", new TableInfo.Column("poster", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMediaItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMediaItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMediaItem = new TableInfo("media_item", _columnsMediaItem, _foreignKeysMediaItem, _indicesMediaItem);
        final TableInfo _existingMediaItem = TableInfo.read(_db, "media_item");
        if (! _infoMediaItem.equals(_existingMediaItem)) {
          return new RoomOpenHelper.ValidationResult(false, "media_item(com.example.omdb.response.MediaItem).\n"
                  + " Expected:\n" + _infoMediaItem + "\n"
                  + " Found:\n" + _existingMediaItem);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteList = new HashMap<String, TableInfo.Column>(5);
        _columnsFavoriteList.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteList.put("year", new TableInfo.Column("year", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteList.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteList.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteList.put("poster", new TableInfo.Column("poster", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteList = new TableInfo("favorite_list", _columnsFavoriteList, _foreignKeysFavoriteList, _indicesFavoriteList);
        final TableInfo _existingFavoriteList = TableInfo.read(_db, "favorite_list");
        if (! _infoFavoriteList.equals(_existingFavoriteList)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_list(com.example.omdb.response.FavoriteMediaItem).\n"
                  + " Expected:\n" + _infoFavoriteList + "\n"
                  + " Found:\n" + _existingFavoriteList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4562145591a386d2e232121aa8887d13", "f21ecc8e37f5372444823910c94b3a83");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "media_item","favorite_list");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `media_item`");
      _db.execSQL("DELETE FROM `favorite_list`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MediaItemDao.class, MediaItemDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FavoriteItemDao.class, FavoriteItemDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MediaItemDao mediaItemDao() {
    if (_mediaItemDao != null) {
      return _mediaItemDao;
    } else {
      synchronized(this) {
        if(_mediaItemDao == null) {
          _mediaItemDao = new MediaItemDao_Impl(this);
        }
        return _mediaItemDao;
      }
    }
  }

  @Override
  public FavoriteItemDao favoriteItemDao() {
    if (_favoriteItemDao != null) {
      return _favoriteItemDao;
    } else {
      synchronized(this) {
        if(_favoriteItemDao == null) {
          _favoriteItemDao = new FavoriteItemDao_Impl(this);
        }
        return _favoriteItemDao;
      }
    }
  }
}
