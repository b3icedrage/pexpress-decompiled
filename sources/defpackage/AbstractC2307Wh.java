package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2307Wh {

    @NotNull
    public final String a;

    public AbstractC2307Wh() {
        String strD = C2017Sp1.a.b(getClass()).d();
        if (strD == null) {
            Intrinsics.k();
        }
        this.a = strD;
    }

    @NotNull
    public String a() {
        return this.a;
    }
}
