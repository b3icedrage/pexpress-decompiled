package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7888yk1 {
    @Nullable
    public static final C4267hk1 a(@NotNull C4267hk1 c4267hk1, @NotNull C2656a72 typeTable) {
        Intrinsics.checkNotNullParameter(c4267hk1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i = c4267hk1.g;
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            return c4267hk1.q;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            return typeTable.a(c4267hk1.r);
        }
        return null;
    }

    @Nullable
    public static final C4267hk1 b(@NotNull C2575Zj1 c2575Zj1, @NotNull C2656a72 typeTable) {
        Intrinsics.checkNotNullParameter(c2575Zj1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i = c2575Zj1.g;
        if ((i & 32) == 32) {
            return c2575Zj1.n;
        }
        if ((i & 64) == 64) {
            return typeTable.a(c2575Zj1.o);
        }
        return null;
    }

    @NotNull
    public static final C4267hk1 c(@NotNull C2575Zj1 c2575Zj1, @NotNull C2656a72 typeTable) {
        Intrinsics.checkNotNullParameter(c2575Zj1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i = c2575Zj1.g;
        if ((i & 8) == 8) {
            C4267hk1 c4267hk1 = c2575Zj1.k;
            Intrinsics.checkNotNullExpressionValue(c4267hk1, "getReturnType(...)");
            return c4267hk1;
        }
        if ((i & 16) == 16) {
            return typeTable.a(c2575Zj1.l);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    @NotNull
    public static final C4267hk1 d(@NotNull C3637ek1 c3637ek1, @NotNull C2656a72 typeTable) {
        Intrinsics.checkNotNullParameter(c3637ek1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i = c3637ek1.g;
        if ((i & 8) == 8) {
            C4267hk1 c4267hk1 = c3637ek1.k;
            Intrinsics.checkNotNullExpressionValue(c4267hk1, "getReturnType(...)");
            return c4267hk1;
        }
        if ((i & 16) == 16) {
            return typeTable.a(c3637ek1.l);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    @NotNull
    public static final C4267hk1 e(@NotNull C5155lk1 c5155lk1, @NotNull C2656a72 typeTable) {
        Intrinsics.checkNotNullParameter(c5155lk1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i = c5155lk1.g;
        if ((i & 4) == 4) {
            C4267hk1 c4267hk1 = c5155lk1.j;
            Intrinsics.checkNotNullExpressionValue(c4267hk1, "getType(...)");
            return c4267hk1;
        }
        if ((i & 8) == 8) {
            return typeTable.a(c5155lk1.k);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
