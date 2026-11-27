package defpackage;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC2852b02 implements InterfaceC3061c02 {
    public static final a d;
    public static final b e;
    public static final /* synthetic */ EnumC2852b02[] g;

    /* JADX INFO: renamed from: b02$a */
    public final enum a extends EnumC2852b02 {
        public a() {
            super("DOUBLE", 0);
        }

        @Override // defpackage.InterfaceC3061c02
        public final Number b(C7790yH0 c7790yH0) {
            return Double.valueOf(c7790yH0.d0());
        }
    }

    /* JADX INFO: renamed from: b02$b */
    public final enum b extends EnumC2852b02 {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        @Override // defpackage.InterfaceC3061c02
        public final Number b(C7790yH0 c7790yH0) {
            return new C3351dO0(c7790yH0.B());
        }
    }

    static {
        a aVar = new a();
        d = aVar;
        b bVar = new b();
        e = bVar;
        g = new EnumC2852b02[]{aVar, bVar, new EnumC2852b02() { // from class: b02.c
            @Override // defpackage.InterfaceC3061c02
            public final Number b(C7790yH0 c7790yH0) throws IOException {
                String strB = c7790yH0.B();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strB));
                    } catch (NumberFormatException unused) {
                        Double dValueOf = Double.valueOf(strB);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!c7790yH0.e) {
                                throw new C3584eW0("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c7790yH0.p());
                            }
                        }
                        return dValueOf;
                    }
                } catch (NumberFormatException e2) {
                    StringBuilder sbB = C6495s7.b("Cannot parse ", strB, "; at path ");
                    sbB.append(c7790yH0.p());
                    throw new C6529sH0(sbB.toString(), e2);
                }
            }
        }, new EnumC2852b02() { // from class: b02.d
            @Override // defpackage.InterfaceC3061c02
            public final Number b(C7790yH0 c7790yH0) throws IOException {
                String strB = c7790yH0.B();
                try {
                    return new BigDecimal(strB);
                } catch (NumberFormatException e2) {
                    StringBuilder sbB = C6495s7.b("Cannot parse ", strB, "; at path ");
                    sbB.append(c7790yH0.p());
                    throw new C6529sH0(sbB.toString(), e2);
                }
            }
        }};
    }

    public EnumC2852b02() {
        throw null;
    }

    public static EnumC2852b02 valueOf(String str) {
        return (EnumC2852b02) Enum.valueOf(EnumC2852b02.class, str);
    }

    public static EnumC2852b02[] values() {
        return (EnumC2852b02[]) g.clone();
    }
}
