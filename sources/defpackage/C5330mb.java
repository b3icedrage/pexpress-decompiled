package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5330mb {

    @NotNull
    public final SharedPreferences a;

    public C5330mb(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public final void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.edit().remove(key).commit();
    }

    public final long b(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.getLong(key, j);
    }

    public final boolean c(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.edit().putLong(key, j).commit();
    }
}
