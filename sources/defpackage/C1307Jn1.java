package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Jn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1307Jn1 {

    @NotNull
    public static final ByteBuffer a;

    @NotNull
    public static final C6660su1 b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(0)");
        a = byteBufferAllocate;
        b = new C6660su1(0);
    }
}
