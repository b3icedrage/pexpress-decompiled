package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LmT;", "Lus0;", "LWr0;", "_application", "<init>", "(LWr0;)V", "LWr0;", "", "lock", "Ljava/lang/Object;", "LC71;", "osDatabase", "LC71;", "Lts0;", "getOs", "()Lts0;", "os", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5305mT implements InterfaceC7073us0 {

    @NotNull
    private final InterfaceC2338Wr0 _application;

    @NotNull
    private final Object lock;

    @Nullable
    private C71 osDatabase;

    public C5305mT(@NotNull InterfaceC2338Wr0 _application) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        this._application = _application;
        this.lock = new Object();
    }

    @Override // defpackage.InterfaceC7073us0
    @NotNull
    public InterfaceC6863ts0 getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                try {
                    if (this.osDatabase == null) {
                        this.osDatabase = new C71(new C1034Ga1(), this._application.getAppContext(), 0, 4, null);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C71 c71 = this.osDatabase;
        Intrinsics.checkNotNull(c71);
        return c71;
    }
}
