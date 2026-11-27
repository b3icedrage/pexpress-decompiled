package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.C0741Ch;
import defpackage.C8045zW0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzea extends zzf {
    private final zzdz zza;
    private boolean zzb;

    public zzea(zzfr zzfrVar) {
        super(zzfrVar);
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        this.zza = new zzdz(this, contextZzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104 A[Catch: all -> 0x0108, TryCatch #8 {all -> 0x0108, blocks: (B:69:0x00fe, B:71:0x0104, B:74:0x010a, B:90:0x0142), top: B:107:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124 A[PHI: r8 r16
      0x0124: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:77:0x0122, B:93:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r16v5 ??) = (r16v4 ??), (r16v6 ??) binds: [B:77:0x0122, B:93:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x0165  */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v31 */
    /* JADX WARN: Type inference failed for: r16v32 */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final boolean zzq(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? r16;
        boolean z;
        ?? RawQuery;
        ?? r10;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r110;
        ?? r11;
        ?? r111;
        ?? r12;
        zzg();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r8 = 0;
            r8 = 0;
             = 0;
            ?? r9 = 0;
            sQLiteDatabase = null;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzh = zzh();
                if (sQLiteDatabaseZzh == null) {
                    this.zzb = true;
                    return r2;
                }
                try {
                    try {
                        sQLiteDatabaseZzh.beginTransaction();
                        RawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", null);
                        long j = 0;
                        if (RawQuery != 0) {
                            try {
                                try {
                                    if (RawQuery.moveToFirst()) {
                                        j = RawQuery.getLong(r2);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r8 = RawQuery;
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
                                r19 = r2;
                                r9 = RawQuery;
                                r16 = r19;
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                r2 = r16;
                            } catch (SQLiteFullException e) {
                                e = e;
                                r18 = r2;
                                r12 = RawQuery;
                                r111 = r18;
                                sQLiteDatabase = sQLiteDatabaseZzh;
                                r10 = r12;
                                r16 = r111;
                                this.zzt.zzay().zzd().zzb("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = r16;
                            } catch (SQLiteException e2) {
                                e = e2;
                                r17 = r2;
                                z = true;
                                r11 = RawQuery;
                                r110 = r17;
                                sQLiteDatabase = sQLiteDatabaseZzh;
                                RawQuery = r11;
                                r16 = r110;
                                if (sQLiteDatabase != null) {
                                    try {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        r8 = RawQuery;
                                        if (r8 != 0) {
                                            r8.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        throw th;
                                    }
                                }
                                this.zzt.zzay().zzd().zzb("Error writing entry to local database", e);
                                this.zzb = z;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = r16;
                            }
                        }
                        if (j >= 100000) {
                            this.zzt.zzay().zzd().zza("Data loss, local db full");
                            long j2 = 100001 - j;
                            long jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                            if (jDelete != j2) {
                                r19 = r2;
                                try {
                                    try {
                                        z = true;
                                        try {
                                            this.zzt.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            r19 = r19;
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            r12 = RawQuery;
                                            r111 = r19;
                                            sQLiteDatabase = sQLiteDatabaseZzh;
                                            r10 = r12;
                                            r16 = r111;
                                            this.zzt.zzay().zzd().zzb("Error writing entry; local database full", e);
                                            this.zzb = true;
                                            if (r10 != 0) {
                                                r10.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i2++;
                                            r2 = r16;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            r11 = RawQuery;
                                            r110 = r19;
                                            sQLiteDatabase = sQLiteDatabaseZzh;
                                            RawQuery = r11;
                                            r16 = r110;
                                            if (sQLiteDatabase != null) {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            }
                                            this.zzt.zzay().zzd().zzb("Error writing entry to local database", e);
                                            this.zzb = z;
                                            if (RawQuery != 0) {
                                                RawQuery.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i2++;
                                            r2 = r16;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        r9 = RawQuery;
                                        r16 = r19;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (r9 != 0) {
                                            r9.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        i2++;
                                        r2 = r16;
                                    }
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    r18 = r19;
                                    r12 = RawQuery;
                                    r111 = r18;
                                    sQLiteDatabase = sQLiteDatabaseZzh;
                                    r10 = r12;
                                    r16 = r111;
                                    this.zzt.zzay().zzd().zzb("Error writing entry; local database full", e);
                                    this.zzb = true;
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                    r2 = r16;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    r17 = r19;
                                    z = true;
                                    r11 = RawQuery;
                                    r110 = r17;
                                    sQLiteDatabase = sQLiteDatabaseZzh;
                                    RawQuery = r11;
                                    r16 = r110;
                                    if (sQLiteDatabase != null) {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                    }
                                    this.zzt.zzay().zzd().zzb("Error writing entry to local database", e);
                                    this.zzb = z;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                    r2 = r16;
                                }
                            } else {
                                r19 = r2;
                                z = true;
                            }
                        } else {
                            r19 = r2;
                            z = true;
                        }
                        sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                        sQLiteDatabaseZzh.setTransactionSuccessful();
                        sQLiteDatabaseZzh.endTransaction();
                        if (RawQuery != 0) {
                            RawQuery.close();
                        }
                        sQLiteDatabaseZzh.close();
                        return z;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r8 != 0) {
                            r8.close();
                        }
                        if (sQLiteDatabaseZzh != null) {
                            sQLiteDatabaseZzh.close();
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    r16 = r2;
                } catch (SQLiteFullException e7) {
                    e = e7;
                    r111 = r2;
                    r12 = 0;
                } catch (SQLiteException e8) {
                    e = e8;
                    r110 = r2;
                    z = true;
                    r11 = 0;
                }
            } catch (SQLiteDatabaseLockedException unused4) {
                r16 = r2;
                sQLiteDatabaseZzh = null;
            } catch (SQLiteFullException e9) {
                e = e9;
                r16 = r2;
                r10 = 0;
            } catch (SQLiteException e10) {
                e = e10;
                r16 = r2;
                z = true;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseZzh = null;
            }
        }
        ?? r112 = r2;
        C8045zW0.b(this.zzt, "Failed to write entry to local database");
        return r112;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01f9 A[PHI: r9 r11
      0x01f9: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:112:0x01e7, B:127:0x0214, B:120:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r11v7 android.database.sqlite.SQLiteDatabase) = 
      (r11v5 android.database.sqlite.SQLiteDatabase)
      (r11v6 android.database.sqlite.SQLiteDatabase)
      (r11v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:112:0x01e7, B:127:0x0214, B:120:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x021d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    public final List zzi(int i) {
        SQLiteDatabase sQLiteDatabaseZzh;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        zzkw zzkwVarCreateFromParcel;
        zzac zzacVarCreateFromParcel;
        zzg();
        Cursor cursor = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabaseZzh = zzh();
                if (sQLiteDatabaseZzh == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    sQLiteDatabaseZzh.beginTransaction();
                    try {
                        cursorQuery2 = sQLiteDatabaseZzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                        try {
                            long j2 = -1;
                            if (cursorQuery2.moveToFirst()) {
                                j = cursorQuery2.getLong(0);
                                cursorQuery2.close();
                            } else {
                                cursorQuery2.close();
                                j = -1;
                            }
                            if (j != -1) {
                                str = "rowid<?";
                                strArr = new String[]{String.valueOf(j)};
                            } else {
                                str = null;
                                strArr = null;
                            }
                            cursorQuery = sQLiteDatabaseZzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j2 = cursorQuery.getLong(0);
                                    int i4 = cursorQuery.getInt(1);
                                    byte[] blob = cursorQuery.getBlob(2);
                                    if (i4 == 0) {
                                        Parcel parcelObtain = Parcel.obtain();
                                        try {
                                            try {
                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                parcelObtain.setDataPosition(0);
                                                zzaw zzawVarCreateFromParcel = zzaw.CREATOR.createFromParcel(parcelObtain);
                                                parcelObtain.recycle();
                                                if (zzawVarCreateFromParcel != null) {
                                                    arrayList.add(zzawVarCreateFromParcel);
                                                }
                                            } catch (SafeParcelReader.ParseException unused) {
                                                this.zzt.zzay().zzd().zza("Failed to load event from local database");
                                                parcelObtain.recycle();
                                            }
                                        } catch (Throwable th) {
                                            parcelObtain.recycle();
                                            throw th;
                                        }
                                    } else if (i4 == 1) {
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        try {
                                            try {
                                                parcelObtain2.unmarshall(blob, 0, blob.length);
                                                parcelObtain2.setDataPosition(0);
                                                zzkwVarCreateFromParcel = zzkw.CREATOR.createFromParcel(parcelObtain2);
                                                parcelObtain2.recycle();
                                            } catch (SafeParcelReader.ParseException unused2) {
                                                this.zzt.zzay().zzd().zza("Failed to load user property from local database");
                                                parcelObtain2.recycle();
                                                zzkwVarCreateFromParcel = null;
                                            }
                                            if (zzkwVarCreateFromParcel != null) {
                                                arrayList.add(zzkwVarCreateFromParcel);
                                            }
                                        } catch (Throwable th2) {
                                            parcelObtain2.recycle();
                                            throw th2;
                                        }
                                    } else if (i4 == 2) {
                                        Parcel parcelObtain3 = Parcel.obtain();
                                        try {
                                            try {
                                                parcelObtain3.unmarshall(blob, 0, blob.length);
                                                parcelObtain3.setDataPosition(0);
                                                zzacVarCreateFromParcel = zzac.CREATOR.createFromParcel(parcelObtain3);
                                                parcelObtain3.recycle();
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                this.zzt.zzay().zzd().zza("Failed to load conditional user property from local database");
                                                parcelObtain3.recycle();
                                                zzacVarCreateFromParcel = null;
                                            }
                                            if (zzacVarCreateFromParcel != null) {
                                                arrayList.add(zzacVarCreateFromParcel);
                                            }
                                        } catch (Throwable th3) {
                                            parcelObtain3.recycle();
                                            throw th3;
                                        }
                                    } else if (i4 == 3) {
                                        this.zzt.zzay().zzk().zza("Skipping app launch break");
                                    } else {
                                        this.zzt.zzay().zzd().zza("Unknown record type in local database");
                                    }
                                } catch (SQLiteDatabaseLockedException unused4) {
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    if (sQLiteDatabaseZzh != null) {
                                        try {
                                            if (sQLiteDatabaseZzh.inTransaction()) {
                                                sQLiteDatabaseZzh.endTransaction();
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzh != null) {
                                                sQLiteDatabaseZzh.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                }
                            }
                            if (sQLiteDatabaseZzh.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                this.zzt.zzay().zzd().zza("Fewer entries removed from local database than expected");
                            }
                            sQLiteDatabaseZzh.setTransactionSuccessful();
                            sQLiteDatabaseZzh.endTransaction();
                            cursorQuery.close();
                            sQLiteDatabaseZzh.close();
                            return arrayList;
                        } catch (Throwable th5) {
                            th = th5;
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        cursorQuery2 = null;
                    }
                } catch (SQLiteDatabaseLockedException unused5) {
                    cursorQuery = null;
                } catch (SQLiteFullException e3) {
                    e = e3;
                    cursorQuery = null;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursorQuery = null;
                } catch (Throwable th7) {
                    th = th7;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseZzh != null) {
                        sQLiteDatabaseZzh.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused6) {
                sQLiteDatabaseZzh = null;
                cursorQuery = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseZzh = null;
                cursorQuery = null;
            } catch (SQLiteException e6) {
                e = e6;
                sQLiteDatabaseZzh = null;
                cursorQuery = null;
            } catch (Throwable th8) {
                th = th8;
                sQLiteDatabaseZzh = null;
            }
        }
        C0741Ch.c(this.zzt, "Failed to read events from database in reasonable time");
        return null;
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        return contextZzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[PHI: r4
      0x0069: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:35:0x007c, B:32:0x0067, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzh = zzh();
                            if (sQLiteDatabaseZzh == null) {
                                this.zzb = true;
                                return false;
                            }
                            sQLiteDatabaseZzh.beginTransaction();
                            sQLiteDatabaseZzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseZzh.setTransactionSuccessful();
                            sQLiteDatabaseZzh.endTransaction();
                            sQLiteDatabaseZzh.close();
                            return true;
                        } catch (SQLiteException e) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e);
                            this.zzb = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e2) {
                    this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            C0741Ch.c(this.zzt, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrZzan = this.zzt.zzv().zzan(zzacVar);
        if (bArrZzan.length <= 131072) {
            return zzq(2, bArrZzan);
        }
        this.zzt.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzax.zza(zzawVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(0, bArrMarshall);
        }
        this.zzt.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzkw zzkwVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzkx.zza(zzkwVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(1, bArrMarshall);
        }
        this.zzt.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
