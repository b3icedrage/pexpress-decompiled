package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ai0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0589Ai0 extends AbstractC2307Wh {

    @NotNull
    public final String b;

    @NotNull
    public final Function1<i, Fragment> c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0589Ai0(@NotNull String screenKey, @NotNull Function1<? super i, ? extends Fragment> function1) {
        Intrinsics.d(screenKey, "screenKey");
        this.b = screenKey;
        this.c = function1;
    }

    @Override // defpackage.AbstractC2307Wh
    @NotNull
    public final String a() {
        return this.b;
    }
}
