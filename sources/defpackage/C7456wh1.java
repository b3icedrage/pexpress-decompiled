package defpackage;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: wh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7456wh1 {
    public static final SparseArray<EnumC6825th1> a = new SparseArray<>();
    public static final HashMap<EnumC6825th1, Integer> b;

    static {
        HashMap<EnumC6825th1, Integer> map = new HashMap<>();
        b = map;
        map.put(EnumC6825th1.d, 0);
        map.put(EnumC6825th1.e, 1);
        map.put(EnumC6825th1.g, 2);
        for (EnumC6825th1 enumC6825th1 : map.keySet()) {
            a.append(b.get(enumC6825th1).intValue(), enumC6825th1);
        }
    }

    public static int a(@NonNull EnumC6825th1 enumC6825th1) {
        Integer num = b.get(enumC6825th1);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC6825th1);
    }

    @NonNull
    public static EnumC6825th1 b(int i) {
        EnumC6825th1 enumC6825th1 = a.get(i);
        if (enumC6825th1 != null) {
            return enumC6825th1;
        }
        throw new IllegalArgumentException(EK.e(i, "Unknown Priority for value "));
    }
}
