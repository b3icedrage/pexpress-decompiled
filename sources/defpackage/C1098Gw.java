package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1098Gw extends AbstractC7769yA0 {

    @NotNull
    public static final C1098Gw l = new C1098Gw(C2895bC.l, 0, C2895bC.k);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098Gw(@NotNull C2895bC head, long j, @NotNull O71<C2895bC> pool) {
        super(head, j, pool);
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (this.k) {
            return;
        }
        this.k = true;
    }

    @Override // defpackage.AbstractC7769yA0
    @Nullable
    public final C2895bC k() {
        return null;
    }

    @Override // defpackage.AbstractC7769yA0
    public final void l(@NotNull ByteBuffer destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
    }

    @NotNull
    public final String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }
}
