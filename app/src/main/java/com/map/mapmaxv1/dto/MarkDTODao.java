package com.map.mapmaxv1.dto;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "Mark".
*/
public class MarkDTODao extends AbstractDao<MarkDTO, Long> {

    public static final String TABLENAME = "Mark";

    /**
     * Properties of entity MarkDTO.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property MarkId = new Property(0, long.class, "markId", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Text = new Property(2, String.class, "text", false, "TEXT");
        public final static Property User = new Property(3, String.class, "user", false, "USER");
        public final static Property Date = new Property(4, java.util.Date.class, "date", false, "DATE");
        public final static Property Price = new Property(5, int.class, "price", false, "PRICE");
        public final static Property Lat = new Property(6, double.class, "lat", false, "LAT");
        public final static Property Lng = new Property(7, double.class, "lng", false, "LNG");
        public final static Property Type = new Property(8, String.class, "type", false, "TYPE");
        public final static Property FIO = new Property(9, String.class, "FIO", false, "FIO");
        public final static Property Visible = new Property(10, boolean.class, "visible", false, "VISIBLE");
    }

    private DaoSession daoSession;


    public MarkDTODao(DaoConfig config) {
        super(config);
    }
    
    public MarkDTODao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"Mark\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: markId
                "\"TITLE\" TEXT NOT NULL ," + // 1: title
                "\"TEXT\" TEXT NOT NULL ," + // 2: text
                "\"USER\" TEXT NOT NULL ," + // 3: user
                "\"DATE\" INTEGER NOT NULL ," + // 4: date
                "\"PRICE\" INTEGER NOT NULL ," + // 5: price
                "\"LAT\" REAL NOT NULL ," + // 6: lat
                "\"LNG\" REAL NOT NULL ," + // 7: lng
                "\"TYPE\" TEXT NOT NULL ," + // 8: type
                "\"FIO\" TEXT NOT NULL ," + // 9: FIO
                "\"VISIBLE\" INTEGER NOT NULL );"); // 10: visible
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"Mark\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MarkDTO entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getMarkId());
        stmt.bindString(2, entity.getTitle());
        stmt.bindString(3, entity.getText());
        stmt.bindString(4, entity.getUser());
        stmt.bindLong(5, entity.getDate().getTime());
        stmt.bindLong(6, entity.getPrice());
        stmt.bindDouble(7, entity.getLat());
        stmt.bindDouble(8, entity.getLng());
        stmt.bindString(9, entity.getType());
        stmt.bindString(10, entity.getFIO());
        stmt.bindLong(11, entity.getVisible() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MarkDTO entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getMarkId());
        stmt.bindString(2, entity.getTitle());
        stmt.bindString(3, entity.getText());
        stmt.bindString(4, entity.getUser());
        stmt.bindLong(5, entity.getDate().getTime());
        stmt.bindLong(6, entity.getPrice());
        stmt.bindDouble(7, entity.getLat());
        stmt.bindDouble(8, entity.getLng());
        stmt.bindString(9, entity.getType());
        stmt.bindString(10, entity.getFIO());
        stmt.bindLong(11, entity.getVisible() ? 1L: 0L);
    }

    @Override
    protected final void attachEntity(MarkDTO entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public MarkDTO readEntity(Cursor cursor, int offset) {
        MarkDTO entity = new MarkDTO( //
            cursor.getLong(offset + 0), // markId
            cursor.getString(offset + 1), // title
            cursor.getString(offset + 2), // text
            cursor.getString(offset + 3), // user
            new java.util.Date(cursor.getLong(offset + 4)), // date
            cursor.getInt(offset + 5), // price
            cursor.getDouble(offset + 6), // lat
            cursor.getDouble(offset + 7), // lng
            cursor.getString(offset + 8), // type
            cursor.getString(offset + 9), // FIO
            cursor.getShort(offset + 10) != 0 // visible
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MarkDTO entity, int offset) {
        entity.setMarkId(cursor.getLong(offset + 0));
        entity.setTitle(cursor.getString(offset + 1));
        entity.setText(cursor.getString(offset + 2));
        entity.setUser(cursor.getString(offset + 3));
        entity.setDate(new java.util.Date(cursor.getLong(offset + 4)));
        entity.setPrice(cursor.getInt(offset + 5));
        entity.setLat(cursor.getDouble(offset + 6));
        entity.setLng(cursor.getDouble(offset + 7));
        entity.setType(cursor.getString(offset + 8));
        entity.setFIO(cursor.getString(offset + 9));
        entity.setVisible(cursor.getShort(offset + 10) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MarkDTO entity, long rowId) {
        entity.setMarkId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MarkDTO entity) {
        if(entity != null) {
            return entity.getMarkId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MarkDTO entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}