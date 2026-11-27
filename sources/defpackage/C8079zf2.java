package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lzf2;", "TType", "", "<init>", "()V", "waitForWake", "(LJM;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "wake", "(Ljava/lang/Object;)V", "LOz;", "channel", "LOz;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C8079zf2<TType> {

    @NotNull
    private final InterfaceC1733Oz<TType> channel = C2889bA.a(-1, 6, null);

    @Nullable
    public final Object waitForWake(@NotNull JM<? super TType> jm) {
        return this.channel.h(jm);
    }

    public final void wake(TType value) {
        Object objN = this.channel.n(value);
        if (objN instanceof C3308dA.b) {
            throw new Exception("WaiterWithValue.wait failed", C3308dA.a(objN));
        }
    }
}
