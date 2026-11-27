package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0855Dt implements InterfaceC7071ur1 {
    @Override // defpackage.InterfaceC7071ur1
    @Nullable
    public final Object a(@NotNull C5918pN0.a.C0472a c0472a) {
        return Unit.a;
    }

    @Override // defpackage.InterfaceC7071ur1
    @Nullable
    public final Unit b() {
        Unit unit = Unit.a;
        MN mn = MN.d;
        return unit;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return e();
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return g();
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return i();
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return l();
    }

    public final boolean n() {
        return !o();
    }

    public final boolean o() {
        EnumC2217Ve0.e.getClass();
        Intrinsics.checkNotNullParameter("pb", AppMeasurementSdk.ConditionalUserProperty.NAME);
        for (EnumC2217Ve0 enumC2217Ve0 : EnumC2217Ve0.values()) {
            if (enumC2217Ve0.d.equals("pb")) {
                switch (enumC2217Ve0) {
                    case EnumC2217Ve0.BB:
                        return c();
                    case EnumC2217Ve0.BB_STUB:
                        return d();
                    case EnumC2217Ve0.EB:
                        return e();
                    case EnumC2217Ve0.EB_STUB:
                        return f();
                    case EnumC2217Ve0.IQ:
                        return g();
                    case EnumC2217Ve0.IQ_STUB:
                        return h();
                    case EnumC2217Ve0.OB:
                        return i();
                    case EnumC2217Ve0.OB_STUB:
                        return k();
                    case EnumC2217Ve0.OB_HUAWEI:
                        return j();
                    case EnumC2217Ve0.PB:
                        return l();
                    case EnumC2217Ve0.PB_STUB:
                        return m();
                    default:
                        throw new C6489s51();
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
