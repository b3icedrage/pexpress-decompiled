package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6749tK1<T> {

    @NotNull
    public final SharedPreferences a;

    @NotNull
    public final String b;
    public final T c;

    @Nullable
    public T d;

    public C6749tK1(@NotNull SharedPreferences preferences, @NotNull String name, T t) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = preferences;
        this.b = name;
        this.c = t;
    }

    public final Object a(@NotNull IJ0 property, @Nullable Object obj) {
        T t;
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = this.d;
        T t3 = this.c;
        if (t2 == null) {
            boolean z = t3 instanceof Boolean;
            String str = this.b;
            SharedPreferences sharedPreferences = this.a;
            if (z) {
                t = (T) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) t3).booleanValue()));
            } else if (t3 instanceof Integer) {
                t = (T) Integer.valueOf(sharedPreferences.getInt(str, ((Number) t3).intValue()));
            } else if (t3 instanceof Long) {
                t = (T) Long.valueOf(sharedPreferences.getLong(str, ((Number) t3).longValue()));
            } else if (t3 instanceof Float) {
                t = (T) Float.valueOf(sharedPreferences.getFloat(str, ((Number) t3).floatValue()));
            } else {
                if (!(t3 instanceof String)) {
                    throw new IllegalArgumentException("Unsupported type");
                }
                t = (T) sharedPreferences.getString(str, (String) t3);
            }
            this.d = t;
        }
        T t4 = this.d;
        return t4 == null ? t3 : t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull IJ0 property, Object obj) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.d = obj;
        SharedPreferences.Editor editorEdit = this.a.edit();
        boolean z = obj instanceof Boolean;
        String str = this.b;
        if (z) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Number) obj).floatValue());
        } else {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Unsupported type");
            }
            editorEdit.putString(str, (String) obj);
        }
        editorEdit.apply();
    }
}
