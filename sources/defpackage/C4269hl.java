package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4269hl {

    @NotNull
    public static final Set<String> a;

    static {
        String[] elements = {"captcha", "duo_auth", "duo_auth.wait_code"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
    }
}
