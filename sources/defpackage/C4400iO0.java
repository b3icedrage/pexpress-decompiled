package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4400iO0 extends X0 {
    public final FC g;
    public final C1411Kw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400iO0(@NotNull FC fc) {
        super(InterfaceC2396Xc.a.a, C6761tO1.d);
        if (fc == null) {
            G0(0);
            throw null;
        }
        this.g = fc;
        this.h = new C1411Kw0(fc);
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        FC fc = this.g;
        if (fc != null) {
            return fc;
        }
        G0(2);
        throw null;
    }

    @Override // defpackage.InterfaceC1076Go1
    @NotNull
    public final InterfaceC1232Io1 getValue() {
        C1411Kw0 c1411Kw0 = this.h;
        if (c1411Kw0 != null) {
            return c1411Kw0;
        }
        G0(1);
        throw null;
    }

    @Override // defpackage.AbstractC4885kU
    public final String toString() {
        return "class " + this.g.getName() + "::this";
    }
}
