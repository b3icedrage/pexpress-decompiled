package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1562Mv {

    /* JADX INFO: renamed from: Mv$a */
    public static class a {
        public static <T> T a(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        public static <T> T[] b(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        public static <T> ArrayList<T> c(@NonNull Bundle bundle, String str, @NonNull Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        public static <T extends Serializable> T d(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        public static <T> SparseArray<T> e(@NonNull Bundle bundle, String str, @NonNull Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    public static Object a(String str, @NonNull Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, str, C4603j7.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C4603j7.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
