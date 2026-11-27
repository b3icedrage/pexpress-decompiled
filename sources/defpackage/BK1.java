package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class BK1 {

    @NotNull
    public final SharedPreferences a;

    @Nullable
    public final LinkedHashSet b;

    public BK1(@NotNull SharedPreferences prefs, @Nullable LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.a = prefs;
        this.b = linkedHashSet;
    }
}
