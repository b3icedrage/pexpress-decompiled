package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class PM1 {
    public final C7607xQ0<Integer, Bitmap> a = new C7607xQ0<>();
    public final TreeMap<Integer, Integer> b = new TreeMap<>();

    public final void a(int i) {
        TreeMap<Integer, Integer> treeMap = this.b;
        int iIntValue = ((Number) PW0.d(treeMap, Integer.valueOf(i))).intValue();
        if (iIntValue == 1) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), Integer.valueOf(iIntValue - 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Bitmap b(int i, int i2, @NotNull Bitmap.Config config) {
        int i3;
        Intrinsics.checkNotNullParameter(config, "config");
        int i4 = i * i2;
        if (config == Bitmap.Config.ALPHA_8) {
            i3 = 1;
        } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            i3 = 2;
        } else {
            i3 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
        }
        int iIntValue = i4 * i3;
        Integer numCeilingKey = this.b.ceilingKey(Integer.valueOf(iIntValue));
        Object objRemove = null;
        if (numCeilingKey != null) {
            if (numCeilingKey.intValue() > iIntValue * 4) {
                numCeilingKey = null;
            }
            if (numCeilingKey != null) {
                iIntValue = numCeilingKey.intValue();
            }
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        C7607xQ0<Integer, Bitmap> c7607xQ0 = this.a;
        HashMap<K, C7607xQ0.a<K, V>> map = c7607xQ0.b;
        Object aVar = map.get(numValueOf);
        if (aVar == null) {
            aVar = new C7607xQ0.a(numValueOf);
            map.put((K) numValueOf, (C7607xQ0.a<K, V>) aVar);
        }
        C7607xQ0.a<K, V> aVar2 = (C7607xQ0.a) aVar;
        C7607xQ0.a<K, V> aVar3 = aVar2.b;
        C7607xQ0.a<K, V> aVar4 = aVar2.c;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(aVar4, "<set-?>");
        aVar3.c = aVar4;
        C7607xQ0.a<K, V> aVar5 = aVar2.c;
        C7607xQ0.a<K, V> aVar6 = aVar2.b;
        aVar5.getClass();
        Intrinsics.checkNotNullParameter(aVar6, "<set-?>");
        aVar5.b = aVar6;
        C7607xQ0.a<K, V> aVar7 = c7607xQ0.a;
        Intrinsics.checkNotNullParameter(aVar7, "<set-?>");
        aVar2.b = aVar7;
        C7607xQ0.a<K, V> aVar8 = aVar7.c;
        Intrinsics.checkNotNullParameter(aVar8, "<set-?>");
        aVar2.c = aVar8;
        aVar8.getClass();
        Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
        aVar8.b = aVar2;
        C7607xQ0.a<K, V> aVar9 = aVar2.b;
        aVar9.getClass();
        Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
        aVar9.c = aVar2;
        ArrayList arrayList = aVar2.a;
        if (arrayList != null) {
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            if (!arrayList.isEmpty()) {
                objRemove = arrayList.remove(WE.e(arrayList));
            }
        }
        Bitmap bitmap = (Bitmap) objRemove;
        if (bitmap != null) {
            a(iIntValue);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void c(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iG = C3057c.g(bitmap);
        Integer numValueOf = Integer.valueOf(iG);
        C7607xQ0<Integer, Bitmap> c7607xQ0 = this.a;
        HashMap<Integer, C7607xQ0.a<Integer, Bitmap>> map = c7607xQ0.b;
        Object obj = map.get(numValueOf);
        Object obj2 = obj;
        if (obj == null) {
            C7607xQ0.a<K, V> aVar = new C7607xQ0.a<>(numValueOf);
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            aVar.c = aVar;
            C7607xQ0.a<K, V> aVar2 = aVar.b;
            Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
            aVar.b = aVar2;
            C7607xQ0.a aVar3 = c7607xQ0.a;
            C7607xQ0.a<K, V> aVar4 = aVar3.b;
            Intrinsics.checkNotNullParameter(aVar4, "<set-?>");
            aVar.b = aVar4;
            Intrinsics.checkNotNullParameter(aVar3, "<set-?>");
            aVar.c = aVar3;
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            aVar3.b = aVar;
            C7607xQ0.a<K, V> aVar5 = aVar.b;
            aVar5.getClass();
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            aVar5.c = aVar;
            map.put((K) numValueOf, aVar);
            obj2 = aVar;
        }
        C7607xQ0.a aVar6 = (C7607xQ0.a) obj2;
        ArrayList arrayList = aVar6.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            aVar6.a = arrayList;
        }
        arrayList.add(bitmap);
        TreeMap<Integer, Integer> treeMap = this.b;
        Integer num = treeMap.get(Integer.valueOf(iG));
        treeMap.put(Integer.valueOf(iG), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Nullable
    public final Bitmap d() {
        Object objRemove;
        C7607xQ0<Integer, Bitmap> c7607xQ0 = this.a;
        C7607xQ0.a<Integer, Bitmap> aVar = c7607xQ0.a;
        C7607xQ0.a aVar2 = aVar.b;
        while (true) {
            objRemove = null;
            if (Intrinsics.a(aVar2, aVar)) {
                break;
            }
            ArrayList arrayList = aVar2.a;
            if (arrayList != null) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.isEmpty()) {
                    objRemove = arrayList.remove(WE.e(arrayList));
                }
            }
            if (objRemove != null) {
                break;
            }
            C7607xQ0.a<K, V> aVar3 = aVar2.b;
            C7607xQ0.a<K, V> aVar4 = aVar2.c;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(aVar4, "<set-?>");
            aVar3.c = aVar4;
            C7607xQ0.a<K, V> aVar5 = aVar2.c;
            C7607xQ0.a<K, V> aVar6 = aVar2.b;
            aVar5.getClass();
            Intrinsics.checkNotNullParameter(aVar6, "<set-?>");
            aVar5.b = aVar6;
            HashMap<Integer, C7607xQ0.a<Integer, Bitmap>> map = c7607xQ0.b;
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            F62.c(map).remove(aVar2.d);
            aVar2 = aVar2.b;
        }
        Bitmap bitmap = (Bitmap) objRemove;
        if (bitmap != null) {
            a(bitmap.getAllocationByteCount());
        }
        return bitmap;
    }

    @NotNull
    public final String toString() {
        return "SizeStrategy: entries=" + this.a + ", sizes=" + this.b;
    }
}
