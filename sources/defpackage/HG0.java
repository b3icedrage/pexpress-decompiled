package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HG0 extends AbstractC3268d0 {

    @NotNull
    public final AbstractC4995l0 a;

    @NotNull
    public final WH1 b;

    public HG0(@NotNull AbstractC4995l0 lexer, @NotNull AbstractC5267mG0 json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.a = lexer;
        this.b = json.b;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final short A() {
        AbstractC4995l0 abstractC4995l0 = this.a;
        String strL = abstractC4995l0.l();
        try {
            return h.f(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.EH
    @NotNull
    public final G1 a() {
        return this.b;
    }

    @Override // defpackage.EH
    public final int h(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final int o() {
        AbstractC4995l0 abstractC4995l0 = this.a;
        String strL = abstractC4995l0.l();
        try {
            return h.b(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final long v() {
        AbstractC4995l0 abstractC4995l0 = this.a;
        String strL = abstractC4995l0.l();
        try {
            return h.d(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final byte z() {
        AbstractC4995l0 abstractC4995l0 = this.a;
        String strL = abstractC4995l0.l();
        try {
            return h.a(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
