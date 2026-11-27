package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"LoT0;", "Leu0;", "Lav0;", "_subscriptionBackend", "LTv0;", "_identityModelStore", "Lqj1;", "_propertiesModelStore", "<init>", "(Lav0;LTv0;Lqj1;)V", "LnT0;", "loginUserOp", "LT90;", "loginUser", "(LnT0;LJM;)Ljava/lang/Object;", "", "LQ91;", "operations", "execute", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "Lav0;", "LTv0;", "Lqj1;", "", "getOperations", "()Ljava/util/List;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5726oT0 implements InterfaceC3669eu0 {

    @NotNull
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final InterfaceC2834av0 _subscriptionBackend;

    /* JADX INFO: renamed from: oT0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C5013l41.a.values().length];
            iArr[C5013l41.a.RETRYABLE.ordinal()] = 1;
            iArr[C5013l41.a.UNAUTHORIZED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: oT0$c */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.LoginUserFromSubscriptionOperationExecutor", f = "LoginUserFromSubscriptionOperationExecutor.kt", l = {46}, m = "loginUser")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5726oT0.this.loginUser(null, this);
        }
    }

    public C5726oT0(@NotNull InterfaceC2834av0 _subscriptionBackend, @NotNull C2112Tv0 _identityModelStore, @NotNull C6204qj1 _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._subscriptionBackend = _subscriptionBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object loginUser(C5516nT0 c5516nT0, JM<? super T90> jm) {
        c cVar;
        C5726oT0 c5726oT0;
        C5516nT0 c5516nT1;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        Object identityFromSubscription = cVar.result;
        MN mn = MN.d;
        int i2 = cVar.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(identityFromSubscription);
                InterfaceC2834av0 interfaceC2834av0 = this._subscriptionBackend;
                String appId = c5516nT0.getAppId();
                String subscriptionId = c5516nT0.getSubscriptionId();
                cVar.L$0 = this;
                cVar.L$1 = c5516nT0;
                cVar.label = 1;
                identityFromSubscription = interfaceC2834av0.getIdentityFromSubscription(appId, subscriptionId, cVar);
                if (identityFromSubscription == mn) {
                    return mn;
                }
                c5726oT0 = this;
                c5516nT1 = c5516nT0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5516nT1 = (C5516nT0) cVar.L$1;
                c5726oT0 = (C5726oT0) cVar.L$0;
                C1795Pt1.b(identityFromSubscription);
            }
            String str = (String) ((Map) identityFromSubscription).getOrDefault("onesignal_id", null);
            if (str == null) {
                NS0.warn$default("Subscription " + c5516nT1.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(c5516nT1.getOnesignalId(), str);
            C2034Sv0 model = c5726oT0._identityModelStore.getModel();
            C5994pj1 model2 = c5726oT0._propertiesModelStore.getModel();
            if (Intrinsics.a(model.getOnesignalId(), c5516nT1.getOnesignalId())) {
                D01.setStringProperty$default(model, "onesignal_id", str, "HYDRATE", false, 8, null);
            }
            if (Intrinsics.a(model2.getOnesignalId(), c5516nT1.getOnesignalId())) {
                D01.setStringProperty$default(model2, "onesignalId", str, "HYDRATE", false, 8, null);
            }
            return new T90(U90.SUCCESS, linkedHashMap, VE.c(new C3658eq1(c5516nT1.getAppId(), str)), null, 8, null);
        } catch (C7063up e) {
            int i3 = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i3 != 1) {
                return i3 != 2 ? new T90(U90.FAIL_NORETRY, null, null, null, 14, null) : new T90(U90.FAIL_UNAUTHORIZED, null, null, null, 14, null);
            }
            return new T90(U90.FAIL_RETRY, null, null, null, 14, null);
        }
    }

    @Override // defpackage.InterfaceC3669eu0
    @Nullable
    public Object execute(@NotNull List<? extends Q91> list, @NotNull JM<? super T90> jm) throws Exception {
        NS0.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        Q91 q91 = (Q91) CollectionsKt.F(list);
        if (q91 instanceof C5516nT0) {
            return loginUser((C5516nT0) q91, jm);
        }
        throw new Exception("Unrecognized operation: " + q91);
    }

    @Override // defpackage.InterfaceC3669eu0
    @NotNull
    public List<String> getOperations() {
        return VE.c(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
