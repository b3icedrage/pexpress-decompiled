package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6718tA0 implements InterfaceC0829Dk0<Object> {
    public final /* synthetic */ RJ0<Object> a;

    public C6718tA0(RJ0<Object> rj0) {
        this.a = rj0;
    }

    @Override // defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.InterfaceC0829Dk0
    @NotNull
    public final RJ0<?>[] b() {
        return new RJ0[]{this.a};
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.RJ0
    public final Object d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }
}
