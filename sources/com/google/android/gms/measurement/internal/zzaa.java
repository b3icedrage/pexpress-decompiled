package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzoc;
import defpackage.C8092zj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0249  */
    /* JADX WARN: Code duplicated, block: B:105:0x0259  */
    /* JADX WARN: Code duplicated, block: B:107:0x0264  */
    /* JADX WARN: Code duplicated, block: B:111:0x0290 A[Catch: all -> 0x02ab, SQLiteException -> 0x02ad, LOOP:11: B:111:0x0290->B:523:?, LOOP_START, TryCatch #5 {all -> 0x02ab, blocks: (B:109:0x028a, B:111:0x0290, B:113:0x02a1, B:119:0x02af, B:122:0x02c4, B:131:0x02d2), top: B:448:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a1 A[Catch: all -> 0x02ab, SQLiteException -> 0x02ad, TryCatch #5 {all -> 0x02ab, blocks: (B:109:0x028a, B:111:0x0290, B:113:0x02a1, B:119:0x02af, B:122:0x02c4, B:131:0x02d2), top: B:448:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c4 A[Catch: all -> 0x02ab, SQLiteException -> 0x02ad, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x02ab, blocks: (B:109:0x028a, B:111:0x0290, B:113:0x02a1, B:119:0x02af, B:122:0x02c4, B:131:0x02d2), top: B:448:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:140:0x030d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0324  */
    /* JADX WARN: Code duplicated, block: B:183:0x0443  */
    /* JADX WARN: Code duplicated, block: B:185:0x0447  */
    /* JADX WARN: Code duplicated, block: B:189:0x0454  */
    /* JADX WARN: Code duplicated, block: B:191:0x0474  */
    /* JADX WARN: Code duplicated, block: B:197:0x048b  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:206:0x04be  */
    /* JADX WARN: Code duplicated, block: B:212:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:218:0x050b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0514  */
    /* JADX WARN: Code duplicated, block: B:223:0x051e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0540  */
    /* JADX WARN: Code duplicated, block: B:226:0x0544  */
    /* JADX WARN: Code duplicated, block: B:231:0x055d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:259:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:263:0x061f  */
    /* JADX WARN: Code duplicated, block: B:264:0x065e  */
    /* JADX WARN: Code duplicated, block: B:267:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:273:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:280:0x0715 A[Catch: all -> 0x071e, SQLiteException -> 0x0720, TryCatch #4 {SQLiteException -> 0x0720, blocks: (B:275:0x06f0, B:276:0x06f4, B:278:0x0705, B:280:0x0715, B:285:0x0722, B:288:0x0738, B:287:0x0727, B:292:0x0745), top: B:446:0x06f0 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x0743  */
    /* JADX WARN: Code duplicated, block: B:293:0x0747 A[PHI: r0 r6 r20 r22
      0x0747: PHI (r0v111 java.util.Map) = (r0v113 java.util.Map), (r0v119 java.util.Map) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]
      0x0747: PHI (r6v21 android.database.Cursor) = (r6v22 android.database.Cursor), (r6v23 android.database.Cursor) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]
      0x0747: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]
      0x0747: PHI (r22v12 com.google.android.gms.measurement.internal.zzas) = (r22v13 com.google.android.gms.measurement.internal.zzas), (r22v15 com.google.android.gms.measurement.internal.zzas) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:312:0x077e  */
    /* JADX WARN: Code duplicated, block: B:316:0x0798  */
    /* JADX WARN: Code duplicated, block: B:322:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:324:0x07f2 A[LOOP:10: B:320:0x07c3->B:324:0x07f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x0806  */
    /* JADX WARN: Code duplicated, block: B:334:0x0820  */
    /* JADX WARN: Code duplicated, block: B:337:0x082f  */
    /* JADX WARN: Code duplicated, block: B:339:0x0842  */
    /* JADX WARN: Code duplicated, block: B:343:0x087b A[Catch: all -> 0x08ac, SQLiteException -> 0x08bc, LOOP:3: B:343:0x087b->B:365:0x08e3, LOOP_START, PHI: r3 r6
      0x087b: PHI (r3v44 java.lang.String) = (r3v36 java.lang.String), (r3v48 java.lang.String) binds: [B:342:0x0879, B:365:0x08e3] A[DONT_GENERATE, DONT_INLINE]
      0x087b: PHI (r6v43 java.util.Iterator) = (r6v35 java.util.Iterator), (r6v45 java.util.Iterator) binds: [B:342:0x0879, B:365:0x08e3] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {all -> 0x08ac, blocks: (B:341:0x0875, B:343:0x087b, B:344:0x0880, B:346:0x0891, B:349:0x08a3, B:355:0x08b6, B:362:0x08d8, B:378:0x0901, B:359:0x08c1, B:361:0x08d1, B:369:0x08ee), top: B:449:0x0875 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:354:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:365:0x08e3 A[LOOP:3: B:343:0x087b->B:365:0x08e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:368:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:370:0x08f0 A[PHI: r0 r13 r18 r48
      0x08f0: PHI (r0v172 java.util.Map) = (r0v174 java.util.Map), (r0v180 java.util.Map) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]
      0x08f0: PHI (r13v14 android.database.Cursor) = (r13v15 android.database.Cursor), (r13v16 android.database.Cursor) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]
      0x08f0: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]
      0x08f0: PHI (r48v7 java.util.Iterator) = (r48v8 java.util.Iterator), (r48v11 java.util.Iterator) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:385:0x0921  */
    /* JADX WARN: Code duplicated, block: B:389:0x0933  */
    /* JADX WARN: Code duplicated, block: B:393:0x0958  */
    /* JADX WARN: Code duplicated, block: B:396:0x0969  */
    /* JADX WARN: Code duplicated, block: B:398:0x0980  */
    /* JADX WARN: Code duplicated, block: B:400:0x0990  */
    /* JADX WARN: Code duplicated, block: B:401:0x0999  */
    /* JADX WARN: Code duplicated, block: B:403:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:406:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:415:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:416:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:420:0x0a32 A[PHI: r49
      0x0a32: PHI (r49v3 java.util.Map) = (r49v4 java.util.Map), (r0v152 java.util.Map) binds: [B:419:0x0a30, B:417:0x0a24] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:425:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:493:0x08de A[EDGE_INSN: B:493:0x08de->B:364:0x08de BREAK  A[LOOP:3: B:343:0x087b->B:365:0x08e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0945 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0a37 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0a2e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0a04 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0a4f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x05f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x07b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x07aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0802 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x07fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x05bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x04cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x032a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:570:0x020f A[EDGE_INSN: B:570:0x020f->B:83:0x020f BREAK  A[LOOP:22: B:70:0x01c3->B:84:0x0214], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4 A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_LEAVE, TryCatch #13 {all -> 0x01b2, blocks: (B:59:0x019e, B:61:0x01a4, B:69:0x01be, B:70:0x01c3, B:71:0x01cd, B:72:0x01dd, B:81:0x0209, B:74:0x01ec, B:78:0x01fc, B:80:0x0202, B:98:0x0232), top: B:463:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01be A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_ENTER, TryCatch #13 {all -> 0x01b2, blocks: (B:59:0x019e, B:61:0x01a4, B:69:0x01be, B:70:0x01c3, B:71:0x01cd, B:72:0x01dd, B:81:0x0209, B:74:0x01ec, B:78:0x01fc, B:80:0x0202, B:98:0x0232), top: B:463:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0214 A[LOOP:22: B:70:0x01c3->B:84:0x0214, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223 */
    /* JADX WARN: Type inference failed for: r0v224 */
    /* JADX WARN: Type inference failed for: r0v51, types: [aM1, zj] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final List zza(String str, List list, List list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        Object obj;
        Map map;
        Cursor cursor;
        boolean z2;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzgi zzgiVar;
        BitSet bitSet;
        BitSet bitSet2;
        C8092zj c8092zj;
        com.google.android.gms.internal.measurement.zzgi zzgiVar2;
        List list3;
        int i3;
        boolean z3;
        Iterator it;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        Long lValueOf;
        String str3;
        ?? c8092zj2;
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? r5;
        Cursor cursorRawQuery;
        ?? r0;
        C8092zj c8092zj3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzgi zzgiVar3;
        List list4;
        ?? r16;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        zzw zzwVar;
        C8092zj c8092zj4;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzft zzftVar;
        com.google.android.gms.internal.measurement.zzft zzftVarZza;
        zzam zzamVarZzi;
        String str6;
        String strZzh;
        zzas zzasVarZzn;
        zzas zzasVar;
        long j;
        String strZzh2;
        Map map4;
        zzas zzasVar2;
        long j2;
        String str7;
        String str8;
        int iIntValue;
        Iterator it4;
        boolean zZzd;
        Map map5;
        zzx zzxVar;
        zzam zzamVarZzi2;
        String str9;
        C8092zj c8092zj5;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List arrayList2;
        String str10;
        String str11;
        ArrayList arrayList3;
        zzam zzamVarZzi3;
        String str12;
        ContentValues contentValues;
        C8092zj c8092zj6;
        Iterator it5;
        String strZzf;
        Map map6;
        String str13;
        Iterator it6;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzet zzetVar;
        Integer numValueOf3;
        zzz zzzVar;
        Integer numValueOf4;
        zzam zzamVarZzi4;
        String str14;
        C8092zj c8092zj7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List list5;
        List arrayList4;
        C8092zj c8092zj8;
        int i4;
        ?? r6;
        Cursor cursorQuery4;
        List arrayList5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new C8092zj();
        this.zzd = l;
        this.zze = l2;
        Iterator it7 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it7.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it7.next()).zzh())) {
                z = true;
                break;
            }
        }
        zznz.zzc();
        boolean zZzs = this.zzt.zzf().zzs(this.zza, zzdu.zzW);
        zznz.zzc();
        boolean zZzs2 = this.zzt.zzf().zzs(this.zza, zzdu.zzV);
        if (z) {
            zzam zzamVarZzi5 = this.zzf.zzi();
            String str15 = this.zza;
            zzamVarZzi5.zzW();
            zzamVarZzi5.zzg();
            Preconditions.checkNotEmpty(str15);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseZzh2 = zzamVarZzi5.zzh();
                sQLiteDatabaseZzh2.update("events", contentValues2, "app_id = ?", new String[]{str15});
                obj = sQLiteDatabaseZzh2;
            } catch (SQLiteException e) {
                zzamVarZzi5.zzt.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeh.zzn(str15), e);
                obj = "Error resetting session-scoped event counts. appId";
            }
        }
        Map map7 = Collections.EMPTY_MAP;
        String str16 = "data";
        String str17 = "audience_id";
        if (zZzs2 && zZzs) {
            zzam zzamVarZzi6 = this.zzf.zzi();
            String str18 = this.zza;
            Preconditions.checkNotEmpty(str18);
            C8092zj c8092zj9 = new C8092zj();
            try {
                try {
                    cursorQuery4 = zzamVarZzi6.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str18}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery4.getBlob(i2))).zzaC();
                                    if (zzekVar.zzo()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list6 = (List) c8092zj9.get(numValueOf6);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            c8092zj9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzekVar);
                                    }
                                } catch (IOException e2) {
                                    zzamVarZzi6.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(str18), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery4.close();
                            map = c8092zj9;
                        } else {
                            cursorQuery4.close();
                            map = map7;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzamVarZzi6.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str18), e);
                        map7 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map7;
                        zzam zzamVarZzi7 = this.zzf.zzi();
                        String str19 = this.zza;
                        zzamVarZzi7.zzW();
                        zzamVarZzi7.zzg();
                        Preconditions.checkNotEmpty(str19);
                        cursorQuery = zzamVarZzi7.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    c8092zj8 = new C8092zj();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            c8092zj8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzkv.zzl(com.google.android.gms.internal.measurement.zzgi.zzf(), cursorQuery.getBlob(1))).zzaC());
                                            z2 = z;
                                            str2 = str16;
                                        } catch (IOException e4) {
                                            z2 = z;
                                            str2 = str16;
                                            try {
                                                zzamVarZzi7.zzt.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeh.zzn(str19), Integer.valueOf(i4), e4);
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                str17 = str17;
                                                zzamVarZzi7.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str19), e);
                                                Map map8 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map8;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z2) {
                                                        String str20 = this.zza;
                                                        zzam zzamVarZzi8 = this.zzf.zzi();
                                                        str3 = this.zza;
                                                        zzamVarZzi8.zzW();
                                                        zzamVarZzi8.zzg();
                                                        Preconditions.checkNotEmpty(str3);
                                                        c8092zj2 = new C8092zj();
                                                        sQLiteDatabaseZzh = zzamVarZzi8.zzh();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c8092zj2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c8092zj2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c8092zj2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    zzamVarZzi8.zzt.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeh.zzn(str3), e);
                                                                    c8092zj2 = Collections.EMPTY_MAP;
                                                                    r0 = c8092zj2;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str20);
                                                                    Preconditions.checkNotNull(map2);
                                                                    c8092zj3 = new C8092zj();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r16 = r0;
                                                                            c8092zj3.put(num, zzgiVar3);
                                                                            r0 = r16;
                                                                            hashSet = hashSet;
                                                                            it2 = it2;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = c8092zj3;
                                                                    for (Integer num2 : hashSet2) {
                                                                        num2.intValue();
                                                                        zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        c8092zj = new C8092zj();
                                                                        if (zzgiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzj()) {
                                                                                if (zzfrVar.zzh()) {
                                                                                    Map map9 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzfrVar.zza());
                                                                                    if (zzfrVar.zzg()) {
                                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    c8092zj.put(numValueOf7, lValueOf);
                                                                                    map3 = map9;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map10 = map3;
                                                                        C8092zj c8092zj10 = new C8092zj();
                                                                        if (zzgiVar != null) {
                                                                            it = zzgiVar.zzm().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                                                                if (!zzgkVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zzgiVar2 = zzgiVar;
                                                                        if (zzgiVar2 != null) {
                                                                            i3 = 0;
                                                                            while (i3 < zzgiVar2.zzd() * 64) {
                                                                                if (zzkv.zzv(zzgiVar2.zzn(), i3)) {
                                                                                    z3 = zZzs;
                                                                                    this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                                                                                    bitSet2.set(i3);
                                                                                    if (zzkv.zzv(zzgiVar2.zzk(), i3)) {
                                                                                        bitSet.set(i3);
                                                                                    }
                                                                                    i3++;
                                                                                    zZzs = z3;
                                                                                } else {
                                                                                    z3 = zZzs;
                                                                                }
                                                                                c8092zj.remove(Integer.valueOf(i3));
                                                                                i3++;
                                                                                zZzs = z3;
                                                                            }
                                                                        }
                                                                        boolean z4 = zZzs;
                                                                        com.google.android.gms.internal.measurement.zzgi zzgiVar4 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                                                                        if (!zZzs2) {
                                                                        }
                                                                        this.zzc.put(num2, new zzu(this, this.zza, zzgiVar4, bitSet, bitSet2, c8092zj, c8092zj10, null));
                                                                        zZzs = z4;
                                                                        map3 = map10;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str17;
                                                                    if (!list.isEmpty()) {
                                                                        zzwVar = new zzw(this, null);
                                                                        c8092zj4 = new C8092zj();
                                                                        it3 = list.iterator();
                                                                        while (it3.hasNext()) {
                                                                            zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                                                            zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                                                            if (zzftVarZza != null) {
                                                                                zzamVarZzi = this.zzf.zzi();
                                                                                str6 = this.zza;
                                                                                strZzh = zzftVarZza.zzh();
                                                                                zzasVarZzn = zzamVarZzi.zzn(str6, zzftVar.zzh());
                                                                                if (zzasVarZzn == null) {
                                                                                    zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str6), zzamVarZzi.zzt.zzj().zzd(strZzh));
                                                                                    zzasVar = new zzas(str6, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                                                } else {
                                                                                    zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                                                }
                                                                                this.zzf.zzi().zzE(zzasVar);
                                                                                j = zzasVar.zzc;
                                                                                strZzh2 = zzftVarZza.zzh();
                                                                                map4 = (Map) c8092zj4.get(strZzh2);
                                                                                if (map4 == null) {
                                                                                    zzamVarZzi2 = this.zzf.zzi();
                                                                                    str9 = this.zza;
                                                                                    zzamVarZzi2.zzW();
                                                                                    zzamVarZzi2.zzg();
                                                                                    Preconditions.checkNotEmpty(str9);
                                                                                    Preconditions.checkNotEmpty(strZzh2);
                                                                                    c8092zj5 = new C8092zj();
                                                                                    str7 = str4;
                                                                                    str8 = str5;
                                                                                    try {
                                                                                        try {
                                                                                            zzasVar2 = zzasVar;
                                                                                            try {
                                                                                                cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                                            j2 = j;
                                                                                                            do {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        com.google.android.gms.internal.measurement.zzek zzekVar2 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                                                                                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                        arrayList2 = (List) c8092zj5.get(numValueOf2);
                                                                                                                        if (arrayList2 == null) {
                                                                                                                            arrayList2 = new ArrayList();
                                                                                                                            c8092zj5.put(numValueOf2, arrayList2);
                                                                                                                        }
                                                                                                                        arrayList2.add(zzekVar2);
                                                                                                                    } catch (IOException e7) {
                                                                                                                        zzamVarZzi2.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(str9), e7);
                                                                                                                    }
                                                                                                                } catch (SQLiteException e8) {
                                                                                                                    e = e8;
                                                                                                                    zzamVarZzi2.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str9), e);
                                                                                                                    map4 = Collections.EMPTY_MAP;
                                                                                                                    if (cursorQuery2 != null) {
                                                                                                                        cursorQuery2.close();
                                                                                                                    }
                                                                                                                }
                                                                                                            } while (cursorQuery2.moveToNext());
                                                                                                            cursorQuery2.close();
                                                                                                            map4 = c8092zj5;
                                                                                                        } else {
                                                                                                            j2 = j;
                                                                                                            map4 = Collections.EMPTY_MAP;
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        cursor2 = cursorQuery2;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e9) {
                                                                                                    e = e9;
                                                                                                    j2 = j;
                                                                                                }
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                j2 = j;
                                                                                                cursorQuery2 = null;
                                                                                                zzamVarZzi2.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str9), e);
                                                                                                map4 = Collections.EMPTY_MAP;
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                c8092zj4.put(strZzh2, map4);
                                                                                                for (Integer num3 : map4.keySet()) {
                                                                                                    iIntValue = num3.intValue();
                                                                                                    if (this.zzb.contains(num3)) {
                                                                                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num3);
                                                                                                    } else {
                                                                                                        it4 = ((List) map4.get(num3)).iterator();
                                                                                                        zZzd = true;
                                                                                                        while (true) {
                                                                                                            if (!it4.hasNext()) {
                                                                                                                map5 = map4;
                                                                                                                break;
                                                                                                            }
                                                                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                                                            zzxVar = new zzx(this, this.zza, iIntValue, zzekVar3);
                                                                                                            map5 = map4;
                                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j2, zzasVar2, zzf(iIntValue, zzekVar3.zzb()));
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(num3);
                                                                                                                break;
                                                                                                            }
                                                                                                            zzd(num3).zzc(zzxVar);
                                                                                                            map4 = map5;
                                                                                                        }
                                                                                                        if (!zZzd) {
                                                                                                            this.zzb.add(num3);
                                                                                                        }
                                                                                                        map4 = map5;
                                                                                                    }
                                                                                                }
                                                                                                str4 = str7;
                                                                                                str5 = str8;
                                                                                                zzwVar = zzwVar;
                                                                                                it3 = it3;
                                                                                            }
                                                                                        } catch (SQLiteException e11) {
                                                                                            e = e11;
                                                                                            zzasVar2 = zzasVar;
                                                                                        }
                                                                                        c8092zj4.put(strZzh2, map4);
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        cursor2 = null;
                                                                                    }
                                                                                } else {
                                                                                    zzasVar2 = zzasVar;
                                                                                    j2 = j;
                                                                                    str7 = str4;
                                                                                    str8 = str5;
                                                                                }
                                                                                while (r6.hasNext()) {
                                                                                    iIntValue = num3.intValue();
                                                                                    if (this.zzb.contains(num3)) {
                                                                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num3);
                                                                                    } else {
                                                                                        it4 = ((List) map4.get(num3)).iterator();
                                                                                        zZzd = true;
                                                                                        while (true) {
                                                                                            if (!it4.hasNext()) {
                                                                                                map5 = map4;
                                                                                                break;
                                                                                            }
                                                                                            com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                                            zzxVar = new zzx(this, this.zza, iIntValue, zzekVar4);
                                                                                            map5 = map4;
                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j2, zzasVar2, zzf(iIntValue, zzekVar4.zzb()));
                                                                                            if (!zZzd) {
                                                                                                this.zzb.add(num3);
                                                                                                break;
                                                                                            }
                                                                                            zzd(num3).zzc(zzxVar);
                                                                                            map4 = map5;
                                                                                        }
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(num3);
                                                                                        }
                                                                                        map4 = map5;
                                                                                    }
                                                                                }
                                                                                str4 = str7;
                                                                                str5 = str8;
                                                                                zzwVar = zzwVar;
                                                                                it3 = it3;
                                                                            }
                                                                        }
                                                                    }
                                                                    str10 = str4;
                                                                    str11 = str5;
                                                                    if (!list2.isEmpty()) {
                                                                        c8092zj6 = new C8092zj();
                                                                        it5 = list2.iterator();
                                                                        while (it5.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                                                                            strZzf = zzgmVar.zzf();
                                                                            map6 = (Map) c8092zj6.get(strZzf);
                                                                            if (map6 == null) {
                                                                                zzamVarZzi4 = this.zzf.zzi();
                                                                                str14 = this.zza;
                                                                                zzamVarZzi4.zzW();
                                                                                zzamVarZzi4.zzg();
                                                                                Preconditions.checkNotEmpty(str14);
                                                                                Preconditions.checkNotEmpty(strZzf);
                                                                                c8092zj7 = new C8092zj();
                                                                                try {
                                                                                    cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzet zzetVar2 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                                                                                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                        list5 = (List) c8092zj7.get(numValueOf5);
                                                                                                        if (list5 == null) {
                                                                                                            str13 = str10;
                                                                                                            try {
                                                                                                                arrayList4 = new ArrayList();
                                                                                                                c8092zj7.put(numValueOf5, arrayList4);
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                it5 = it5;
                                                                                                                zzamVarZzi4.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str14), e);
                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery3 != null) {
                                                                                                                    cursorQuery3.close();
                                                                                                                }
                                                                                                                c8092zj6.put(strZzf, map6);
                                                                                                                for (Integer num4 : map6.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.zzb.contains(num4)) {
                                                                                                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map6.get(num4)).iterator();
                                                                                                                    zZzd2 = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                                                                                                            if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                                                                                                zzef zzefVarZzj = this.zzt.zzay().zzj();
                                                                                                                                if (zzetVar.zzj()) {
                                                                                                                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                                                                                } else {
                                                                                                                                    numValueOf4 = null;
                                                                                                                                }
                                                                                                                                zzefVarZzj.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                                                                                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                                                                                                            }
                                                                                                                            if (zzetVar.zzj()) {
                                                                                                                            }
                                                                                                                            zzef zzefVarZzk = this.zzt.zzay().zzk();
                                                                                                                            Object objZzn = zzeh.zzn(this.zza);
                                                                                                                            if (zzetVar.zzj()) {
                                                                                                                                numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                                                                            } else {
                                                                                                                                numValueOf3 = null;
                                                                                                                            }
                                                                                                                            zzefVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf3));
                                                                                                                            this.zzb.add(num4);
                                                                                                                            map6 = map6;
                                                                                                                        } else {
                                                                                                                            map6 = map6;
                                                                                                                        }
                                                                                                                        if (!zZzd2) {
                                                                                                                            this.zzb.add(num4);
                                                                                                                        }
                                                                                                                        map6 = map6;
                                                                                                                        zzd(num4).zzc(zzzVar);
                                                                                                                        map6 = map6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it5 = it5;
                                                                                                                str10 = str13;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str13 = str10;
                                                                                                            arrayList4 = list5;
                                                                                                        }
                                                                                                        arrayList4.add(zzetVar2);
                                                                                                    } catch (IOException e13) {
                                                                                                        str13 = str10;
                                                                                                        zzamVarZzi4.zzt.zzay().zzd().zzc("Failed to merge filter", zzeh.zzn(str14), e13);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it5 = it5;
                                                                                                        str10 = str13;
                                                                                                    } catch (SQLiteException e14) {
                                                                                                        e = e14;
                                                                                                        zzamVarZzi4.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str14), e);
                                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery3.close();
                                                                                                map6 = c8092zj7;
                                                                                            } else {
                                                                                                str13 = str10;
                                                                                                it5 = it5;
                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            cursor3 = cursorQuery3;
                                                                                            if (cursor3 != null) {
                                                                                                cursor3.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        str13 = str10;
                                                                                    }
                                                                                } catch (SQLiteException e16) {
                                                                                    e = e16;
                                                                                    str13 = str10;
                                                                                    it5 = it5;
                                                                                    cursorQuery3 = null;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    cursor3 = null;
                                                                                }
                                                                                c8092zj6.put(strZzf, map6);
                                                                            } else {
                                                                                str13 = str10;
                                                                                it5 = it5;
                                                                            }
                                                                            while (r3.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map6.get(num4)).iterator();
                                                                                zZzd2 = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                                                                        if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                                                            zzef zzefVarZzj2 = this.zzt.zzay().zzj();
                                                                                            if (zzetVar.zzj()) {
                                                                                                numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            zzefVarZzj2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                                                            this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                                                                        }
                                                                                        if (zzetVar.zzj()) {
                                                                                        }
                                                                                        zzef zzefVarZzk2 = this.zzt.zzay().zzk();
                                                                                        Object objZzn2 = zzeh.zzn(this.zza);
                                                                                        if (zzetVar.zzj()) {
                                                                                            numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        zzefVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf3));
                                                                                        this.zzb.add(num4);
                                                                                        map6 = map6;
                                                                                    } else {
                                                                                        map6 = map6;
                                                                                    }
                                                                                    if (!zZzd2) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    map6 = map6;
                                                                                    zzd(num4).zzc(zzzVar);
                                                                                    map6 = map6;
                                                                                }
                                                                            }
                                                                            it5 = it5;
                                                                            str10 = str13;
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        zzu zzuVar = (zzu) this.zzc.get(num5);
                                                                        Preconditions.checkNotNull(zzuVar);
                                                                        com.google.android.gms.internal.measurement.zzfp zzfpVarZza = zzuVar.zza(iIntValue4);
                                                                        arrayList3.add(zzfpVarZza);
                                                                        zzamVarZzi3 = this.zzf.zzi();
                                                                        str12 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzgi zzgiVarZzd = zzfpVarZza.zzd();
                                                                        zzamVarZzi3.zzW();
                                                                        zzamVarZzi3.zzg();
                                                                        Preconditions.checkNotEmpty(str12);
                                                                        Preconditions.checkNotNull(zzgiVarZzd);
                                                                        byte[] bArrZzbu = zzgiVarZzd.zzbu();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str12);
                                                                        contentValues.put(str11, num5);
                                                                        contentValues.put("current_results", bArrZzbu);
                                                                        try {
                                                                            try {
                                                                                if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzamVarZzi3.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str12));
                                                                                }
                                                                            } catch (SQLiteException e17) {
                                                                                e = e17;
                                                                                zzamVarZzi3.zzt.zzay().zzd().zzc("Error storing filter results. appId", zzeh.zzn(str12), e);
                                                                            }
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                        }
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                r5 = sQLiteDatabaseZzh;
                                                                if (r5 != 0) {
                                                                    r5.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e19) {
                                                            e = e19;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r5 = 0;
                                                            if (r5 != 0) {
                                                                r5.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = c8092zj2;
                                                        Preconditions.checkNotEmpty(str20);
                                                        Preconditions.checkNotNull(map2);
                                                        c8092zj3 = new C8092zj();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r16 = r0;
                                                                c8092zj3.put(num, zzgiVar3);
                                                                r0 = r16;
                                                                hashSet = hashSet;
                                                                it2 = it2;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = c8092zj3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num2.intValue();
                                                        zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c8092zj = new C8092zj();
                                                        if (zzgiVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzfrVar.zzh()) {
                                                                    Map map11 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzfrVar.zza());
                                                                    if (zzfrVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c8092zj.put(numValueOf8, lValueOf);
                                                                    map3 = map11;
                                                                }
                                                            }
                                                        }
                                                        Map map12 = map3;
                                                        C8092zj c8092zj11 = new C8092zj();
                                                        if (zzgiVar != null) {
                                                            it = zzgiVar.zzm().iterator();
                                                            while (it.hasNext()) {
                                                                zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                                                if (!zzgkVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        zzgiVar2 = zzgiVar;
                                                        if (zzgiVar2 != null) {
                                                            i3 = 0;
                                                            while (i3 < zzgiVar2.zzd() * 64) {
                                                                if (zzkv.zzv(zzgiVar2.zzn(), i3)) {
                                                                    z3 = zZzs;
                                                                    this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                                                                    bitSet2.set(i3);
                                                                    if (zzkv.zzv(zzgiVar2.zzk(), i3)) {
                                                                        bitSet.set(i3);
                                                                    }
                                                                    i3++;
                                                                    zZzs = z3;
                                                                } else {
                                                                    z3 = zZzs;
                                                                }
                                                                c8092zj.remove(Integer.valueOf(i3));
                                                                i3++;
                                                                zZzs = z3;
                                                            }
                                                        }
                                                        boolean z5 = zZzs;
                                                        com.google.android.gms.internal.measurement.zzgi zzgiVar5 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                                                        if (!zZzs2) {
                                                        }
                                                        this.zzc.put(num2, new zzu(this, this.zza, zzgiVar5, bitSet, bitSet2, c8092zj, c8092zj11, null));
                                                        zZzs = z5;
                                                        map3 = map12;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str17;
                                                if (!list.isEmpty()) {
                                                    zzwVar = new zzw(this, null);
                                                    c8092zj4 = new C8092zj();
                                                    it3 = list.iterator();
                                                    while (it3.hasNext()) {
                                                        zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                                        zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                                        if (zzftVarZza != null) {
                                                            zzamVarZzi = this.zzf.zzi();
                                                            str6 = this.zza;
                                                            strZzh = zzftVarZza.zzh();
                                                            zzasVarZzn = zzamVarZzi.zzn(str6, zzftVar.zzh());
                                                            if (zzasVarZzn == null) {
                                                                zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str6), zzamVarZzi.zzt.zzj().zzd(strZzh));
                                                                zzasVar = new zzas(str6, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                            }
                                                            this.zzf.zzi().zzE(zzasVar);
                                                            j = zzasVar.zzc;
                                                            strZzh2 = zzftVarZza.zzh();
                                                            map4 = (Map) c8092zj4.get(strZzh2);
                                                            if (map4 == null) {
                                                                zzamVarZzi2 = this.zzf.zzi();
                                                                str9 = this.zza;
                                                                zzamVarZzi2.zzW();
                                                                zzamVarZzi2.zzg();
                                                                Preconditions.checkNotEmpty(str9);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                c8092zj5 = new C8092zj();
                                                                str7 = str4;
                                                                str8 = str5;
                                                                zzasVar2 = zzasVar;
                                                                cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                                                                if (cursorQuery2.moveToFirst()) {
                                                                    j2 = j;
                                                                    do {
                                                                        com.google.android.gms.internal.measurement.zzek zzekVar5 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                        arrayList2 = (List) c8092zj5.get(numValueOf2);
                                                                        if (arrayList2 == null) {
                                                                            arrayList2 = new ArrayList();
                                                                            c8092zj5.put(numValueOf2, arrayList2);
                                                                        }
                                                                        arrayList2.add(zzekVar5);
                                                                    } while (cursorQuery2.moveToNext());
                                                                    cursorQuery2.close();
                                                                    map4 = c8092zj5;
                                                                } else {
                                                                    j2 = j;
                                                                    map4 = Collections.EMPTY_MAP;
                                                                    cursorQuery2.close();
                                                                }
                                                                c8092zj4.put(strZzh2, map4);
                                                            } else {
                                                                zzasVar2 = zzasVar;
                                                                j2 = j;
                                                                str7 = str4;
                                                                str8 = str5;
                                                            }
                                                            while (r6.hasNext()) {
                                                                iIntValue = num3.intValue();
                                                                if (this.zzb.contains(num3)) {
                                                                    this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num3);
                                                                } else {
                                                                    it4 = ((List) map4.get(num3)).iterator();
                                                                    zZzd = true;
                                                                    while (true) {
                                                                        if (!it4.hasNext()) {
                                                                            map5 = map4;
                                                                            break;
                                                                        }
                                                                        com.google.android.gms.internal.measurement.zzek zzekVar6 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                        zzxVar = new zzx(this, this.zza, iIntValue, zzekVar6);
                                                                        map5 = map4;
                                                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j2, zzasVar2, zzf(iIntValue, zzekVar6.zzb()));
                                                                        if (!zZzd) {
                                                                            this.zzb.add(num3);
                                                                            break;
                                                                        }
                                                                        zzd(num3).zzc(zzxVar);
                                                                        map4 = map5;
                                                                    }
                                                                    if (!zZzd) {
                                                                        this.zzb.add(num3);
                                                                    }
                                                                    map4 = map5;
                                                                }
                                                            }
                                                            str4 = str7;
                                                            str5 = str8;
                                                            zzwVar = zzwVar;
                                                            it3 = it3;
                                                        }
                                                    }
                                                }
                                                str10 = str4;
                                                str11 = str5;
                                                if (!list2.isEmpty()) {
                                                    c8092zj6 = new C8092zj();
                                                    it5 = list2.iterator();
                                                    while (it5.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzgm zzgmVar2 = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                                                        strZzf = zzgmVar2.zzf();
                                                        map6 = (Map) c8092zj6.get(strZzf);
                                                        if (map6 == null) {
                                                            zzamVarZzi4 = this.zzf.zzi();
                                                            str14 = this.zza;
                                                            zzamVarZzi4.zzW();
                                                            zzamVarZzi4.zzg();
                                                            Preconditions.checkNotEmpty(str14);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            c8092zj7 = new C8092zj();
                                                            cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzet zzetVar3 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list5 = (List) c8092zj7.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        str13 = str10;
                                                                        arrayList4 = new ArrayList();
                                                                        c8092zj7.put(numValueOf5, arrayList4);
                                                                    } else {
                                                                        str13 = str10;
                                                                        arrayList4 = list5;
                                                                    }
                                                                    arrayList4.add(zzetVar3);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it5 = it5;
                                                                    str10 = str13;
                                                                }
                                                                cursorQuery3.close();
                                                                map6 = c8092zj7;
                                                            } else {
                                                                str13 = str10;
                                                                it5 = it5;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery3.close();
                                                            }
                                                            c8092zj6.put(strZzf, map6);
                                                        } else {
                                                            str13 = str10;
                                                            it5 = it5;
                                                        }
                                                        while (r3.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map6.get(num4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                                                    if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                                        zzef zzefVarZzj3 = this.zzt.zzay().zzj();
                                                                        if (zzetVar.zzj()) {
                                                                            numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        zzefVarZzj3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                                        this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                                                    }
                                                                    if (zzetVar.zzj()) {
                                                                    }
                                                                    zzef zzefVarZzk3 = this.zzt.zzay().zzk();
                                                                    Object objZzn3 = zzeh.zzn(this.zza);
                                                                    if (zzetVar.zzj()) {
                                                                        numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    zzefVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf3));
                                                                    this.zzb.add(num4);
                                                                    map6 = map6;
                                                                } else {
                                                                    map6 = map6;
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                map6 = map6;
                                                                zzd(num4).zzc(zzzVar);
                                                                map6 = map6;
                                                            }
                                                        }
                                                        it5 = it5;
                                                        str10 = str13;
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    zzu zzuVar2 = (zzu) this.zzc.get(num5);
                                                    Preconditions.checkNotNull(zzuVar2);
                                                    com.google.android.gms.internal.measurement.zzfp zzfpVarZza2 = zzuVar2.zza(iIntValue6);
                                                    arrayList3.add(zzfpVarZza2);
                                                    zzamVarZzi3 = this.zzf.zzi();
                                                    str12 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzgi zzgiVarZzd2 = zzfpVarZza2.zzd();
                                                    zzamVarZzi3.zzW();
                                                    zzamVarZzi3.zzg();
                                                    Preconditions.checkNotEmpty(str12);
                                                    Preconditions.checkNotNull(zzgiVarZzd2);
                                                    byte[] bArrZzbu2 = zzgiVarZzd2.zzbu();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str12);
                                                    contentValues.put(str11, num5);
                                                    contentValues.put("current_results", bArrZzbu2);
                                                    if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzamVarZzi3.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str12));
                                                    }
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z = z2;
                                            str16 = str2;
                                            str17 = str17;
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            zzamVarZzi7.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str19), e);
                                            Map map13 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map13;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = c8092zj8;
                                } else {
                                    Map map14 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map14;
                                    z2 = z;
                                    str2 = "data";
                                    str17 = "audience_id";
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                            z2 = z;
                            str2 = "data";
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z2) {
                                String str21 = this.zza;
                                zzam zzamVarZzi9 = this.zzf.zzi();
                                str3 = this.zza;
                                zzamVarZzi9.zzW();
                                zzamVarZzi9.zzg();
                                Preconditions.checkNotEmpty(str3);
                                c8092zj2 = new C8092zj();
                                sQLiteDatabaseZzh = zzamVarZzi9.zzh();
                                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c8092zj2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c8092zj2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c8092zj2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = c8092zj2;
                                Preconditions.checkNotEmpty(str21);
                                Preconditions.checkNotNull(map2);
                                c8092zj3 = new C8092zj();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null) {
                                        }
                                        r16 = r0;
                                        c8092zj3.put(num, zzgiVar3);
                                        r0 = r16;
                                        hashSet = hashSet;
                                        it2 = it2;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = c8092zj3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num2.intValue();
                                zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c8092zj = new C8092zj();
                                if (zzgiVar != null) {
                                    while (r7.hasNext()) {
                                        if (zzfrVar.zzh()) {
                                            Map map15 = map3;
                                            Integer numValueOf9 = Integer.valueOf(zzfrVar.zza());
                                            if (zzfrVar.zzg()) {
                                                lValueOf = Long.valueOf(zzfrVar.zzb());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c8092zj.put(numValueOf9, lValueOf);
                                            map3 = map15;
                                        }
                                    }
                                }
                                Map map16 = map3;
                                C8092zj c8092zj12 = new C8092zj();
                                if (zzgiVar != null) {
                                    it = zzgiVar.zzm().iterator();
                                    while (it.hasNext()) {
                                        zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                        if (!zzgkVar.zzi()) {
                                        }
                                    }
                                }
                                zzgiVar2 = zzgiVar;
                                if (zzgiVar2 != null) {
                                    i3 = 0;
                                    while (i3 < zzgiVar2.zzd() * 64) {
                                        if (zzkv.zzv(zzgiVar2.zzn(), i3)) {
                                            z3 = zZzs;
                                            this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                                            bitSet2.set(i3);
                                            if (zzkv.zzv(zzgiVar2.zzk(), i3)) {
                                                bitSet.set(i3);
                                            }
                                            i3++;
                                            zZzs = z3;
                                        } else {
                                            z3 = zZzs;
                                        }
                                        c8092zj.remove(Integer.valueOf(i3));
                                        i3++;
                                        zZzs = z3;
                                    }
                                }
                                boolean z6 = zZzs;
                                com.google.android.gms.internal.measurement.zzgi zzgiVar6 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                                if (!zZzs2) {
                                }
                                this.zzc.put(num2, new zzu(this, this.zza, zzgiVar6, bitSet, bitSet2, c8092zj, c8092zj12, null));
                                zZzs = z6;
                                map3 = map16;
                            }
                        }
                        str4 = str2;
                        str5 = str17;
                        if (!list.isEmpty()) {
                            zzwVar = new zzw(this, null);
                            c8092zj4 = new C8092zj();
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                if (zzftVarZza != null) {
                                    zzamVarZzi = this.zzf.zzi();
                                    str6 = this.zza;
                                    strZzh = zzftVarZza.zzh();
                                    zzasVarZzn = zzamVarZzi.zzn(str6, zzftVar.zzh());
                                    if (zzasVarZzn == null) {
                                        zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str6), zzamVarZzi.zzt.zzj().zzd(strZzh));
                                        zzasVar = new zzas(str6, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                    } else {
                                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                    }
                                    this.zzf.zzi().zzE(zzasVar);
                                    j = zzasVar.zzc;
                                    strZzh2 = zzftVarZza.zzh();
                                    map4 = (Map) c8092zj4.get(strZzh2);
                                    if (map4 == null) {
                                        zzamVarZzi2 = this.zzf.zzi();
                                        str9 = this.zza;
                                        zzamVarZzi2.zzW();
                                        zzamVarZzi2.zzg();
                                        Preconditions.checkNotEmpty(str9);
                                        Preconditions.checkNotEmpty(strZzh2);
                                        c8092zj5 = new C8092zj();
                                        str7 = str4;
                                        str8 = str5;
                                        zzasVar2 = zzasVar;
                                        cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                                        if (cursorQuery2.moveToFirst()) {
                                            j2 = j;
                                            do {
                                                com.google.android.gms.internal.measurement.zzek zzekVar7 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                arrayList2 = (List) c8092zj5.get(numValueOf2);
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                    c8092zj5.put(numValueOf2, arrayList2);
                                                }
                                                arrayList2.add(zzekVar7);
                                            } while (cursorQuery2.moveToNext());
                                            cursorQuery2.close();
                                            map4 = c8092zj5;
                                        } else {
                                            j2 = j;
                                            map4 = Collections.EMPTY_MAP;
                                            cursorQuery2.close();
                                        }
                                        c8092zj4.put(strZzh2, map4);
                                    } else {
                                        zzasVar2 = zzasVar;
                                        j2 = j;
                                        str7 = str4;
                                        str8 = str5;
                                    }
                                    while (r6.hasNext()) {
                                        iIntValue = num3.intValue();
                                        if (this.zzb.contains(num3)) {
                                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num3);
                                        } else {
                                            it4 = ((List) map4.get(num3)).iterator();
                                            zZzd = true;
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    map5 = map4;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzek zzekVar8 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                zzxVar = new zzx(this, this.zza, iIntValue, zzekVar8);
                                                map5 = map4;
                                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j2, zzasVar2, zzf(iIntValue, zzekVar8.zzb()));
                                                if (!zZzd) {
                                                    this.zzb.add(num3);
                                                    break;
                                                }
                                                zzd(num3).zzc(zzxVar);
                                                map4 = map5;
                                            }
                                            if (!zZzd) {
                                                this.zzb.add(num3);
                                            }
                                            map4 = map5;
                                        }
                                    }
                                    str4 = str7;
                                    str5 = str8;
                                    zzwVar = zzwVar;
                                    it3 = it3;
                                }
                            }
                        }
                        str10 = str4;
                        str11 = str5;
                        if (!list2.isEmpty()) {
                            c8092zj6 = new C8092zj();
                            it5 = list2.iterator();
                            while (it5.hasNext()) {
                                com.google.android.gms.internal.measurement.zzgm zzgmVar3 = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                                strZzf = zzgmVar3.zzf();
                                map6 = (Map) c8092zj6.get(strZzf);
                                if (map6 == null) {
                                    zzamVarZzi4 = this.zzf.zzi();
                                    str14 = this.zza;
                                    zzamVarZzi4.zzW();
                                    zzamVarZzi4.zzg();
                                    Preconditions.checkNotEmpty(str14);
                                    Preconditions.checkNotEmpty(strZzf);
                                    c8092zj7 = new C8092zj();
                                    cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzet zzetVar4 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                            list5 = (List) c8092zj7.get(numValueOf5);
                                            if (list5 == null) {
                                                str13 = str10;
                                                arrayList4 = new ArrayList();
                                                c8092zj7.put(numValueOf5, arrayList4);
                                            } else {
                                                str13 = str10;
                                                arrayList4 = list5;
                                            }
                                            arrayList4.add(zzetVar4);
                                            if (!cursorQuery3.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it5 = it5;
                                            str10 = str13;
                                        }
                                        cursorQuery3.close();
                                        map6 = c8092zj7;
                                    } else {
                                        str13 = str10;
                                        it5 = it5;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery3.close();
                                    }
                                    c8092zj6.put(strZzf, map6);
                                } else {
                                    str13 = str10;
                                    it5 = it5;
                                }
                                while (r3.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map6.get(num4)).iterator();
                                    zZzd2 = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                            if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                zzef zzefVarZzj4 = this.zzt.zzay().zzj();
                                                if (zzetVar.zzj()) {
                                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                zzefVarZzj4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                            }
                                            if (zzetVar.zzj()) {
                                            }
                                            zzef zzefVarZzk4 = this.zzt.zzay().zzk();
                                            Object objZzn4 = zzeh.zzn(this.zza);
                                            if (zzetVar.zzj()) {
                                                numValueOf3 = Integer.valueOf(zzetVar.zza());
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            zzefVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, String.valueOf(numValueOf3));
                                            this.zzb.add(num4);
                                            map6 = map6;
                                        } else {
                                            map6 = map6;
                                        }
                                        if (!zZzd2) {
                                            this.zzb.add(num4);
                                        }
                                        map6 = map6;
                                        zzd(num4).zzc(zzzVar);
                                        map6 = map6;
                                    }
                                }
                                it5 = it5;
                                str10 = str13;
                            }
                        }
                        arrayList3 = new ArrayList();
                        Set<Integer> setKeySet3 = this.zzc.keySet();
                        setKeySet3.removeAll(this.zzb);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            zzu zzuVar3 = (zzu) this.zzc.get(num5);
                            Preconditions.checkNotNull(zzuVar3);
                            com.google.android.gms.internal.measurement.zzfp zzfpVarZza3 = zzuVar3.zza(iIntValue8);
                            arrayList3.add(zzfpVarZza3);
                            zzamVarZzi3 = this.zzf.zzi();
                            str12 = this.zza;
                            com.google.android.gms.internal.measurement.zzgi zzgiVarZzd3 = zzfpVarZza3.zzd();
                            zzamVarZzi3.zzW();
                            zzamVarZzi3.zzg();
                            Preconditions.checkNotEmpty(str12);
                            Preconditions.checkNotNull(zzgiVarZzd3);
                            byte[] bArrZzbu3 = zzgiVarZzd3.zzbu();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str12);
                            contentValues.put(str11, num5);
                            contentValues.put("current_results", bArrZzbu3);
                            if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzamVarZzi3.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str12));
                            }
                        }
                        return arrayList3;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r6 = obj;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e22) {
                e = e22;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r6 = 0;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } else {
            map = map7;
        }
        zzam zzamVarZzi10 = this.zzf.zzi();
        String str110 = this.zza;
        zzamVarZzi10.zzW();
        zzamVarZzi10.zzg();
        Preconditions.checkNotEmpty(str110);
        try {
            cursorQuery = zzamVarZzi10.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str110}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map17 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map17;
                z2 = z;
                str2 = "data";
                str17 = "audience_id";
            } else {
                c8092zj8 = new C8092zj();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    c8092zj8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzkv.zzl(com.google.android.gms.internal.measurement.zzgi.zzf(), cursorQuery.getBlob(1))).zzaC());
                    z2 = z;
                    str2 = str16;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z = z2;
                    str16 = str2;
                    str17 = str17;
                }
                cursorQuery.close();
                map2 = c8092zj8;
            }
        } catch (SQLiteException e23) {
            e = e23;
            z2 = z;
            str2 = "data";
            str17 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z2) {
                String str22 = this.zza;
                zzam zzamVarZzi11 = this.zzf.zzi();
                str3 = this.zza;
                zzamVarZzi11.zzW();
                zzamVarZzi11.zzg();
                Preconditions.checkNotEmpty(str3);
                c8092zj2 = new C8092zj();
                sQLiteDatabaseZzh = zzamVarZzi11.zzh();
                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c8092zj2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c8092zj2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c8092zj2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = c8092zj2;
                Preconditions.checkNotEmpty(str22);
                Preconditions.checkNotNull(map2);
                c8092zj3 = new C8092zj();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            r16 = r0;
                            c8092zj3.put(num, zzgiVar3);
                            r0 = r16;
                            hashSet = hashSet;
                            it2 = it2;
                        } else {
                            ?? r17 = r0;
                            List listZzq = this.zzf.zzu().zzq(zzgiVar3.zzk(), list4);
                            if (listZzq.isEmpty()) {
                                r0 = r17;
                            } else {
                                com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzgiVar3.zzby();
                                zzghVar.zzf();
                                zzghVar.zzb(listZzq);
                                List listZzq2 = this.zzf.zzu().zzq(zzgiVar3.zzn(), list4);
                                zzghVar.zzh();
                                zzghVar.zzd(listZzq2);
                                zzoc.zzc();
                                if (this.zzt.zzf().zzs(null, zzdu.zzas)) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it8 = zzgiVar3.zzj().iterator();
                                    while (it8.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) it8.next();
                                        Iterator it9 = it8;
                                        if (!list4.contains(Integer.valueOf(zzfrVar2.zza()))) {
                                            arrayList6.add(zzfrVar2);
                                        }
                                        it8 = it9;
                                    }
                                    zzghVar.zze();
                                    zzghVar.zza(arrayList6);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (com.google.android.gms.internal.measurement.zzgk zzgkVar2 : zzgiVar3.zzm()) {
                                        if (!list4.contains(Integer.valueOf(zzgkVar2.zzb()))) {
                                            arrayList7.add(zzgkVar2);
                                        }
                                    }
                                    zzghVar.zzg();
                                    zzghVar.zzc(arrayList7);
                                } else {
                                    for (int i5 = 0; i5 < zzgiVar3.zza(); i5++) {
                                        if (list4.contains(Integer.valueOf(zzgiVar3.zze(i5).zza()))) {
                                            zzghVar.zzi(i5);
                                        }
                                    }
                                    for (int i6 = 0; i6 < zzgiVar3.zzc(); i6++) {
                                        if (list4.contains(Integer.valueOf(zzgiVar3.zzi(i6).zzb()))) {
                                            zzghVar.zzj(i6);
                                        }
                                    }
                                }
                                c8092zj3.put(num, (com.google.android.gms.internal.measurement.zzgi) zzghVar.zzaC());
                                r16 = r17;
                                r0 = r16;
                                hashSet = hashSet;
                                it2 = it2;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = c8092zj3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num2.intValue();
                zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c8092zj = new C8092zj();
                if (zzgiVar != null && zzgiVar.zza() != 0) {
                    while (r7.hasNext()) {
                        if (zzfrVar.zzh()) {
                            Map map18 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzfrVar.zza());
                            if (zzfrVar.zzg()) {
                                lValueOf = Long.valueOf(zzfrVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            c8092zj.put(numValueOf10, lValueOf);
                            map3 = map18;
                        }
                    }
                }
                Map map19 = map3;
                C8092zj c8092zj13 = new C8092zj();
                if (zzgiVar != null && zzgiVar.zzc() != 0) {
                    it = zzgiVar.zzm().iterator();
                    while (it.hasNext()) {
                        zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                        if (!zzgkVar.zzi() && zzgkVar.zza() > 0) {
                            c8092zj13.put(Integer.valueOf(zzgkVar.zzb()), Long.valueOf(zzgkVar.zzc(zzgkVar.zza() - 1)));
                            it = it;
                            zzgiVar = zzgiVar;
                        }
                    }
                }
                zzgiVar2 = zzgiVar;
                if (zzgiVar2 != null) {
                    i3 = 0;
                    while (i3 < zzgiVar2.zzd() * 64) {
                        if (zzkv.zzv(zzgiVar2.zzn(), i3)) {
                            z3 = zZzs;
                            this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzkv.zzv(zzgiVar2.zzk(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            zZzs = z3;
                        } else {
                            z3 = zZzs;
                        }
                        c8092zj.remove(Integer.valueOf(i3));
                        i3++;
                        zZzs = z3;
                    }
                }
                boolean z7 = zZzs;
                com.google.android.gms.internal.measurement.zzgi zzgiVar7 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                if (!zZzs2 && z7 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        com.google.android.gms.internal.measurement.zzek zzekVar9 = (com.google.android.gms.internal.measurement.zzek) it10.next();
                        int iZzb = zzekVar9.zzb();
                        Iterator it11 = it10;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzekVar9.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (c8092zj.containsKey(numValueOf11)) {
                            c8092zj.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (c8092zj13.containsKey(numValueOf11)) {
                            c8092zj13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it10 = it11;
                    }
                }
                this.zzc.put(num2, new zzu(this, this.zza, zzgiVar7, bitSet, bitSet2, c8092zj, c8092zj13, null));
                zZzs = z7;
                map3 = map19;
            }
        }
        str4 = str2;
        str5 = str17;
        if (!list.isEmpty()) {
            zzwVar = new zzw(this, null);
            c8092zj4 = new C8092zj();
            it3 = list.iterator();
            while (it3.hasNext()) {
                zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                if (zzftVarZza != null) {
                    zzamVarZzi = this.zzf.zzi();
                    str6 = this.zza;
                    strZzh = zzftVarZza.zzh();
                    zzasVarZzn = zzamVarZzi.zzn(str6, zzftVar.zzh());
                    if (zzasVarZzn == null) {
                        zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str6), zzamVarZzi.zzt.zzj().zzd(strZzh));
                        zzasVar = new zzas(str6, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                    } else {
                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                    }
                    this.zzf.zzi().zzE(zzasVar);
                    j = zzasVar.zzc;
                    strZzh2 = zzftVarZza.zzh();
                    map4 = (Map) c8092zj4.get(strZzh2);
                    if (map4 == null) {
                        zzamVarZzi2 = this.zzf.zzi();
                        str9 = this.zza;
                        zzamVarZzi2.zzW();
                        zzamVarZzi2.zzg();
                        Preconditions.checkNotEmpty(str9);
                        Preconditions.checkNotEmpty(strZzh2);
                        c8092zj5 = new C8092zj();
                        str7 = str4;
                        str8 = str5;
                        zzasVar2 = zzasVar;
                        cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            j2 = j;
                            do {
                                com.google.android.gms.internal.measurement.zzek zzekVar10 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                arrayList2 = (List) c8092zj5.get(numValueOf2);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    c8092zj5.put(numValueOf2, arrayList2);
                                }
                                arrayList2.add(zzekVar10);
                            } while (cursorQuery2.moveToNext());
                            cursorQuery2.close();
                            map4 = c8092zj5;
                        } else {
                            j2 = j;
                            map4 = Collections.EMPTY_MAP;
                            cursorQuery2.close();
                        }
                        c8092zj4.put(strZzh2, map4);
                    } else {
                        zzasVar2 = zzasVar;
                        j2 = j;
                        str7 = str4;
                        str8 = str5;
                    }
                    while (r6.hasNext()) {
                        iIntValue = num3.intValue();
                        if (this.zzb.contains(num3)) {
                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num3);
                        } else {
                            it4 = ((List) map4.get(num3)).iterator();
                            zZzd = true;
                            while (true) {
                                if (!it4.hasNext()) {
                                    map5 = map4;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzek zzekVar11 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                zzxVar = new zzx(this, this.zza, iIntValue, zzekVar11);
                                map5 = map4;
                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j2, zzasVar2, zzf(iIntValue, zzekVar11.zzb()));
                                if (!zZzd) {
                                    this.zzb.add(num3);
                                    break;
                                }
                                zzd(num3).zzc(zzxVar);
                                map4 = map5;
                            }
                            if (!zZzd) {
                                this.zzb.add(num3);
                            }
                            map4 = map5;
                        }
                    }
                    str4 = str7;
                    str5 = str8;
                    zzwVar = zzwVar;
                    it3 = it3;
                }
            }
        }
        str10 = str4;
        str11 = str5;
        if (!list2.isEmpty()) {
            c8092zj6 = new C8092zj();
            it5 = list2.iterator();
            while (it5.hasNext()) {
                com.google.android.gms.internal.measurement.zzgm zzgmVar4 = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                strZzf = zzgmVar4.zzf();
                map6 = (Map) c8092zj6.get(strZzf);
                if (map6 == null) {
                    zzamVarZzi4 = this.zzf.zzi();
                    str14 = this.zza;
                    zzamVarZzi4.zzW();
                    zzamVarZzi4.zzg();
                    Preconditions.checkNotEmpty(str14);
                    Preconditions.checkNotEmpty(strZzf);
                    c8092zj7 = new C8092zj();
                    cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzet zzetVar5 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                            list5 = (List) c8092zj7.get(numValueOf5);
                            if (list5 == null) {
                                str13 = str10;
                                arrayList4 = new ArrayList();
                                c8092zj7.put(numValueOf5, arrayList4);
                            } else {
                                str13 = str10;
                                arrayList4 = list5;
                            }
                            arrayList4.add(zzetVar5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it5 = it5;
                            str10 = str13;
                        }
                        cursorQuery3.close();
                        map6 = c8092zj7;
                    } else {
                        str13 = str10;
                        it5 = it5;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                    }
                    c8092zj6.put(strZzf, map6);
                } else {
                    str13 = str10;
                    it5 = it5;
                }
                while (r3.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                        break;
                        break;
                    }
                    it6 = ((List) map6.get(num4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it6.hasNext()) {
                            zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                            if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                zzef zzefVarZzj5 = this.zzt.zzay().zzj();
                                if (zzetVar.zzj()) {
                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                } else {
                                    numValueOf4 = null;
                                }
                                zzefVarZzj5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                            }
                            if (zzetVar.zzj() || zzetVar.zza() > 256) {
                                zzef zzefVarZzk5 = this.zzt.zzay().zzk();
                                Object objZzn5 = zzeh.zzn(this.zza);
                                if (zzetVar.zzj()) {
                                    numValueOf3 = Integer.valueOf(zzetVar.zza());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzefVarZzk5.zzc("Invalid property filter ID. appId, id", objZzn5, String.valueOf(numValueOf3));
                                this.zzb.add(num4);
                                map6 = map6;
                            } else {
                                zzzVar = new zzz(this, this.zza, iIntValue9, zzetVar);
                                zZzd2 = zzzVar.zzd(this.zzd, this.zze, zzgmVar4, zzf(iIntValue9, zzetVar.zza()));
                                if (zZzd2) {
                                    zzd(num4).zzc(zzzVar);
                                    map6 = map6;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            map6 = map6;
                        }
                        if (!zZzd2) {
                            this.zzb.add(num4);
                        }
                        map6 = map6;
                    }
                }
                it5 = it5;
                str10 = str13;
            }
        }
        arrayList3 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            zzu zzuVar4 = (zzu) this.zzc.get(num5);
            Preconditions.checkNotNull(zzuVar4);
            com.google.android.gms.internal.measurement.zzfp zzfpVarZza4 = zzuVar4.zza(iIntValue10);
            arrayList3.add(zzfpVarZza4);
            zzamVarZzi3 = this.zzf.zzi();
            str12 = this.zza;
            com.google.android.gms.internal.measurement.zzgi zzgiVarZzd4 = zzfpVarZza4.zzd();
            zzamVarZzi3.zzW();
            zzamVarZzi3.zzg();
            Preconditions.checkNotEmpty(str12);
            Preconditions.checkNotNull(zzgiVarZzd4);
            byte[] bArrZzbu4 = zzgiVarZzd4.zzbu();
            contentValues = new ContentValues();
            contentValues.put("app_id", str12);
            contentValues.put(str11, num5);
            contentValues.put("current_results", bArrZzbu4);
            if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzamVarZzi3.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str12));
            }
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }
}
