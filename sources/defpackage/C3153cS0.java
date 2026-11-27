package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3153cS0 extends C2720aS0.i<Object> {
    public final /* synthetic */ C7732y1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3153cS0(C2720aS0 c2720aS0, C7522x1 c7522x1, C7732y1 c7732y1) {
        super(c2720aS0, c7522x1);
        this.i = c7732y1;
        if (c2720aS0 == null) {
            C2720aS0.i.a(0);
            throw null;
        }
        this.h = null;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.C2720aS0.f
    @NotNull
    public final C2720aS0.m<Object> d(boolean z) {
        return new C2720aS0.m<>(false, new B1.a(VE.c(R70.d)));
    }
}
