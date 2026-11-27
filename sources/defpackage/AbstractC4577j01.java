package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: j01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lj01;", "Lst0;", "<init>", "()V", "", "start", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbstractC4577j01 implements InterfaceC6656st0 {
    @Override // defpackage.InterfaceC6656st0
    public abstract /* synthetic */ boolean isInBadState();

    @Override // defpackage.InterfaceC6656st0
    public abstract /* synthetic */ void recover();

    @Override // defpackage.InterfaceC6656st0
    @NotNull
    public abstract /* synthetic */ String recoveryMessage();

    @Override // defpackage.InterfaceC6656st0, defpackage.InterfaceC2529Yu0
    public void start() {
        if (isInBadState()) {
            NS0.warn$default(recoveryMessage(), null, 2, null);
            recover();
        }
    }
}
