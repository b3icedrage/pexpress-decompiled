package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2508Yn0 {

    @NotNull
    public static final Set<Character> a;

    static {
        Character[] elements = {'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
    }
}
