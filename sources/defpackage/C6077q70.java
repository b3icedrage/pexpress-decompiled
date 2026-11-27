package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6077q70<T extends Enum<T>> implements RJ0<T> {

    @NotNull
    public final T[] a;

    @NotNull
    public final KW1 b;

    /* JADX INFO: renamed from: q70$a */
    public static final class a extends ML0 implements Function0<MH1> {
        public final /* synthetic */ C6077q70<Enum<Object>> d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6077q70<Enum<Object>> c6077q70, String str) {
            super(0);
            this.d = c6077q70;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MH1 invoke() {
            C6077q70<Enum<Object>> c6077q70 = this.d;
            c6077q70.getClass();
            T[] tArr = c6077q70.a;
            C4136h70 c4136h70 = new C4136h70(this.e, tArr.length);
            for (T t : tArr) {
                c4136h70.l(t.name());
            }
            return c4136h70;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6077q70(@NotNull Enum[] values, @NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.a = values;
        this.b = XO0.b(new a(this, serialName));
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        Enum value = (Enum) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        T[] tArr = this.a;
        int iU = C1526Mj.u(tArr, value);
        if (iU != -1) {
            encoder.t(c(), iU);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(c().a());
        sb.append(", must be one of ");
        String string = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        throw new ZH1(sb.toString());
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return (MH1) this.b.getValue();
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iU = decoder.u(c());
        T[] tArr = this.a;
        if (iU >= 0 && iU < tArr.length) {
            return tArr[iU];
        }
        throw new ZH1(iU + " is not among valid " + c().a() + " enum values, values size is " + tArr.length);
    }

    @NotNull
    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + c().a() + '>';
    }
}
