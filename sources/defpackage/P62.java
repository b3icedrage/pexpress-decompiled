package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class P62 extends O62 {
    public final EnumC3610ed2 a;
    public final AbstractC4649jL0 b;

    public P62(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull EnumC3610ed2 enumC3610ed2) {
        if (enumC3610ed2 == null) {
            d(0);
            throw null;
        }
        if (abstractC4649jL0 == null) {
            d(1);
            throw null;
        }
        this.a = enumC3610ed2;
        this.b = abstractC4649jL0;
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.N62
    @NotNull
    public final N62 a(@NotNull AbstractC6331rL0 abstractC6331rL0) {
        if (abstractC6331rL0 != null) {
            return new P62(abstractC6331rL0.t(this.b), this.a);
        }
        d(6);
        throw null;
    }

    @Override // defpackage.N62
    @NotNull
    public final EnumC3610ed2 b() {
        EnumC3610ed2 enumC3610ed2 = this.a;
        if (enumC3610ed2 != null) {
            return enumC3610ed2;
        }
        d(4);
        throw null;
    }

    @Override // defpackage.N62
    public final boolean c() {
        return false;
    }

    @Override // defpackage.N62
    @NotNull
    public final AbstractC4649jL0 getType() {
        AbstractC4649jL0 abstractC4649jL0 = this.b;
        if (abstractC4649jL0 != null) {
            return abstractC4649jL0;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P62(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        this(abstractC4649jL0, EnumC3610ed2.INVARIANT);
        if (abstractC4649jL0 != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
