package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ss1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6654ss1 implements InterfaceC6444rs1 {

    @NotNull
    public final L32 a;

    public C6654ss1(@NotNull L32 tradingRepository) {
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        this.a = tradingRepository;
    }

    @Override // defpackage.InterfaceC6444rs1
    @Nullable
    public final Object b(@NotNull String assetId, long j, long j2, @NotNull JM jm) {
        new Long(j);
        new Long(j2);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.a.d();
        throw null;
    }

    @Override // defpackage.InterfaceC6444rs1
    @Nullable
    public final Object c(@NotNull String assetId, long j, long j2, @NotNull C5520nU1 c5520nU1) {
        new Long(j);
        new Long(j2);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.a.i();
        throw null;
    }
}
