package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzyq extends zzyu {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzyq(zzyp zzypVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List listZzd;
        List list = (List) zzaau.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzyo) {
                listZzd = new zzyn(i);
            } else {
                listZzd = ((list instanceof zzzo) && (list instanceof zzyd)) ? ((zzyd) list).zzd(i) : new ArrayList(i);
            }
            zzaau.zzs(obj, j, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzaau.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof zzaap) {
            zzyn zzynVar = new zzyn(list.size() + i);
            zzynVar.addAll(zzynVar.size(), (zzaap) list);
            zzaau.zzs(obj, j, zzynVar);
            return zzynVar;
        }
        if ((list instanceof zzzo) && (list instanceof zzyd)) {
            zzyd zzydVar = (zzyd) list;
            if (!zzydVar.zzc()) {
                zzyd zzydVarZzd = zzydVar.zzd(list.size() + i);
                zzaau.zzs(obj, j, zzydVarZzd);
                return zzydVarZzd;
            }
        }
        return list;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzaau.zzf(obj, j);
        if (list instanceof zzyo) {
            objUnmodifiableList = ((zzyo) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzzo) && (list instanceof zzyd)) {
                zzyd zzydVar = (zzyd) list;
                if (zzydVar.zzc()) {
                    zzydVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzaau.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzaau.zzf(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzaau.zzs(obj, j, list);
    }

    private zzyq() {
        super(null);
    }
}
