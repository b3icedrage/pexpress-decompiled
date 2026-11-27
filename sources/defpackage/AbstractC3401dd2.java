package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3401dd2 extends AbstractC3191cd2 {
    public final boolean j;
    public InterfaceC5868p71<CK<?>> k;
    public Function0<InterfaceC5868p71<CK<?>>> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3401dd2(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, boolean z, @NotNull VN1 vn1) {
        super(interfaceC4675jU, interfaceC2396Xc, c5638o21, null, vn1);
        if (interfaceC4675jU == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (c5638o21 == null) {
            G0(2);
            throw null;
        }
        if (vn1 == null) {
            G0(3);
            throw null;
        }
        this.j = z;
    }

    public static /* synthetic */ void G0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        } else if (i == 3) {
            objArr[0] = Payload.SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void U0(@Nullable InterfaceC5868p71<CK<?>> interfaceC5868p71, @NotNull Function0<InterfaceC5868p71<CK<?>>> function0) {
        if (function0 == null) {
            G0(5);
            throw null;
        }
        this.l = function0;
        if (interfaceC5868p71 == null) {
            interfaceC5868p71 = function0.invoke();
        }
        this.k = interfaceC5868p71;
    }

    @Override // defpackage.InterfaceC2982bd2
    @Nullable
    public final CK<?> d0() {
        InterfaceC5868p71<CK<?>> interfaceC5868p71 = this.k;
        if (interfaceC5868p71 != null) {
            return interfaceC5868p71.invoke();
        }
        return null;
    }

    @Override // defpackage.InterfaceC2982bd2
    public final boolean p0() {
        return this.j;
    }
}
