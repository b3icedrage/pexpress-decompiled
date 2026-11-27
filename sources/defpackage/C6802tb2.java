package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006\u001e"}, d2 = {"Ltb2;", "LYu0;", "LPu0;", "LWr0;", "_applicationService", "LRu0;", "_sessionService", "Lfu0;", "_operationRepo", "LxI;", "_configModelStore", "LTv0;", "_identityModelStore", "<init>", "(LWr0;LRu0;Lfu0;LxI;LTv0;)V", "", "refreshUser", "()V", "start", "onSessionStarted", "onSessionActive", "", "duration", "onSessionEnded", "(J)V", "LWr0;", "LRu0;", "Lfu0;", "LxI;", "LTv0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6802tb2 implements InterfaceC2529Yu0, InterfaceC1797Pu0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final InterfaceC3879fu0 _operationRepo;

    @NotNull
    private final InterfaceC1953Ru0 _sessionService;

    public C6802tb2(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1953Ru0 _sessionService, @NotNull InterfaceC3879fu0 _operationRepo, @NotNull C7582xI _configModelStore, @NotNull C2112Tv0 _identityModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    private final void refreshUser() {
        if (C6443rs0.INSTANCE.isLocalId(this._identityModelStore.getModel().getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        InterfaceC3879fu0.a.enqueue$default(this._operationRepo, new C3658eq1(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId()), false, 2, null);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionActive() {
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionEnded(long duration) {
    }
}
