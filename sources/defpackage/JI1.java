package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001f"}, d2 = {"LJI1;", "LYu0;", "LPu0;", "Lfu0;", "_operationRepo", "LRu0;", "_sessionService", "LxI;", "_configModelStore", "LTv0;", "_identityModelStore", "Lju0;", "_outcomeEventsController", "<init>", "(Lfu0;LRu0;LxI;LTv0;Lju0;)V", "", "start", "()V", "onSessionStarted", "onSessionActive", "", "duration", "onSessionEnded", "(J)V", "Lfu0;", "LRu0;", "LxI;", "LTv0;", "Lju0;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JI1 implements InterfaceC2529Yu0, InterfaceC1797Pu0 {
    public static final long SECONDS_IN_A_DAY = 86400;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final InterfaceC3879fu0 _operationRepo;

    @NotNull
    private final InterfaceC4767ju0 _outcomeEventsController;

    @NotNull
    private final InterfaceC1953Ru0 _sessionService;

    @InterfaceC3368dU(c = "com.onesignal.session.internal.session.impl.SessionListener$onSessionEnded$1", f = "SessionListener.kt", l = {62}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, JM<? super b> jm) {
            super(1, jm);
            this.$durationInSeconds = j;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return JI1.this.new b(this.$durationInSeconds, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC4767ju0 interfaceC4767ju0 = JI1.this._outcomeEventsController;
                long j = this.$durationInSeconds;
                this.label = 1;
                if (interfaceC4767ju0.sendSessionEndOutcomeEvent(j, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public JI1(@NotNull InterfaceC3879fu0 _operationRepo, @NotNull InterfaceC1953Ru0 _sessionService, @NotNull C7582xI _configModelStore, @NotNull C2112Tv0 _identityModelStore, @NotNull InterfaceC4767ju0 _outcomeEventsController) {
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        this._operationRepo = _operationRepo;
        this._sessionService = _sessionService;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._outcomeEventsController = _outcomeEventsController;
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionEnded(long duration) {
        long j = duration / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        if (j < 1 || j > SECONDS_IN_A_DAY) {
            NS0.error$default("SessionListener.onSessionEnded sending duration of " + j + " seconds", null, 2, null);
        }
        InterfaceC3879fu0.a.enqueue$default(this._operationRepo, new O02(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), j), false, 2, null);
        LY1.suspendifyOnThread$default(0, new b(j, null), 1, null);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionStarted() {
        this._operationRepo.enqueue(new P02(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId()), true);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionActive() {
    }
}
