package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00160\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"LVv0;", "Leu0;", "LJs0;", "_identityBackend", "LTv0;", "_identityModelStore", "Lzu0;", "_buildUserService", "Lx41;", "_newRecordState", "<init>", "(LJs0;LTv0;Lzu0;Lx41;)V", "", "LQ91;", "operations", "LT90;", "execute", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "LJs0;", "LTv0;", "Lzu0;", "Lx41;", "", "getOperations", "()Ljava/util/List;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2268Vv0 implements InterfaceC3669eu0 {

    @NotNull
    public static final String DELETE_ALIAS = "delete-alias";

    @NotNull
    public static final String SET_ALIAS = "set-alias";

    @NotNull
    private final InterfaceC8130zu0 _buildUserService;

    @NotNull
    private final InterfaceC1321Js0 _identityBackend;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final C7536x41 _newRecordState;

    /* JADX INFO: renamed from: Vv0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C5013l41.a.values().length];
            iArr[C5013l41.a.RETRYABLE.ordinal()] = 1;
            iArr[C5013l41.a.INVALID.ordinal()] = 2;
            iArr[C5013l41.a.CONFLICT.ordinal()] = 3;
            iArr[C5013l41.a.UNAUTHORIZED.ordinal()] = 4;
            iArr[C5013l41.a.MISSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: Vv0$c */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.IdentityOperationExecutor", f = "IdentityOperationExecutor.kt", l = {48, 91}, m = "execute")
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
            return C2268Vv0.this.execute(null, this);
        }
    }

    public C2268Vv0(@NotNull InterfaceC1321Js0 _identityBackend, @NotNull C2112Tv0 _identityModelStore, @NotNull InterfaceC8130zu0 _buildUserService, @NotNull C7536x41 _newRecordState) {
        Intrinsics.checkNotNullParameter(_identityBackend, "_identityBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x026f A[Catch: up -> 0x0040, TRY_LEAVE, TryCatch #3 {up -> 0x0040, blocks: (B:14:0x003b, B:104:0x0256, B:106:0x026f), top: B:138:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x02df  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:127:0x0304  */
    /* JADX WARN: Code duplicated, block: B:128:0x0313  */
    /* JADX WARN: Code duplicated, block: B:69:0x014d A[Catch: up -> 0x005a, TRY_LEAVE, TryCatch #0 {up -> 0x005a, blocks: (B:21:0x0055, B:67:0x0134, B:69:0x014d), top: B:132:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    @Override // defpackage.InterfaceC3669eu0
    @Nullable
    public Object execute(@NotNull List<? extends Q91> list, @NotNull JM<? super T90> jm) throws Exception {
        c cVar;
        C2268Vv0 c2268Vv0;
        Q91 q91;
        C2268Vv0 c2268Vv1;
        Q91 q92;
        int i;
        int i2;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i3 = cVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.label = i3 - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        MN mn = MN.d;
        int i4 = cVar2.label;
        if (i4 == 0) {
            C1795Pt1.b(obj);
            NS0.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
            if (list == null || !list.isEmpty()) {
                for (Q91 q93 : list) {
                    if (!(q93 instanceof C3127cJ1) && !(q93 instanceof C4684jX)) {
                        throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                    }
                }
            }
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Q91) it.next()) instanceof C3127cJ1) {
                        if (list != null && list.isEmpty()) {
                            break;
                        }
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((Q91) it2.next()) instanceof C4684jX) {
                                throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                            }
                        }
                        break;
                    }
                }
            }
            Q91 q94 = (Q91) CollectionsKt.L(list);
            if (q94 instanceof C3127cJ1) {
                try {
                    InterfaceC1321Js0 interfaceC1321Js0 = this._identityBackend;
                    String appId = ((C3127cJ1) q94).getAppId();
                    String onesignalId = ((C3127cJ1) q94).getOnesignalId();
                    Map<String, String> mapB = OW0.b(new Pair(((C3127cJ1) q94).getLabel(), ((C3127cJ1) q94).getValue()));
                    cVar2.L$0 = this;
                    cVar2.L$1 = q94;
                    cVar2.label = 1;
                    if (interfaceC1321Js0.setAlias(appId, "onesignal_id", onesignalId, mapB, cVar2) != mn) {
                        c2268Vv0 = this;
                        q91 = q94;
                        if (Intrinsics.a(c2268Vv0._identityModelStore.getModel().getOnesignalId(), ((C3127cJ1) q91).getOnesignalId())) {
                            D01.setStringProperty$default(c2268Vv0._identityModelStore.getModel(), ((C3127cJ1) q91).getLabel(), ((C3127cJ1) q91).getValue(), "HYDRATE", false, 8, null);
                        }
                    }
                } catch (C7063up e) {
                    e = e;
                    c2268Vv0 = this;
                    q91 = q94;
                    i = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                        return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 2) {
                        return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i != 3) {
                        return new T90(U90.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 4) {
                        return new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i == 5) {
                        throw new C6489s51();
                    }
                    if (e.getStatusCode() != 404) {
                    }
                    C3127cJ1 c3127cJ1 = (C3127cJ1) q91;
                    List<Q91> rebuildOperationsIfCurrentUser = c2268Vv0._buildUserService.getRebuildOperationsIfCurrentUser(c3127cJ1.getAppId(), c3127cJ1.getOnesignalId());
                    if (rebuildOperationsIfCurrentUser == null) {
                    }
                }
            } else if (q94 instanceof C4684jX) {
                try {
                    InterfaceC1321Js0 interfaceC1321Js1 = this._identityBackend;
                    String appId2 = ((C4684jX) q94).getAppId();
                    String onesignalId2 = ((C4684jX) q94).getOnesignalId();
                    String label = ((C4684jX) q94).getLabel();
                    cVar2.L$0 = this;
                    cVar2.L$1 = q94;
                    cVar2.label = 2;
                    if (interfaceC1321Js1.deleteAlias(appId2, "onesignal_id", onesignalId2, label, cVar2) != mn) {
                        c2268Vv1 = this;
                        q92 = q94;
                        if (Intrinsics.a(c2268Vv1._identityModelStore.getModel().getOnesignalId(), ((C4684jX) q92).getOnesignalId())) {
                            D01.setOptStringProperty$default(c2268Vv1._identityModelStore.getModel(), ((C4684jX) q92).getLabel(), null, "HYDRATE", false, 8, null);
                        }
                    }
                } catch (C7063up e2) {
                    e = e2;
                    c2268Vv1 = this;
                    q92 = q94;
                    i2 = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i2 != 1) {
                        return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 != 2) {
                        return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i2 != 3) {
                        return new T90(U90.SUCCESS, null, null, null, 14, null);
                    }
                    if (i2 != 4) {
                        return new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 == 5) {
                        return (e.getStatusCode() == 404 || !c2268Vv1._newRecordState.isInMissingRetryWindow(((C4684jX) q92).getOnesignalId())) ? new T90(U90.SUCCESS, null, null, null, 14, null) : new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    throw new C6489s51();
                }
            }
            return mn;
        }
        if (i4 == 1) {
            q91 = (Q91) cVar2.L$1;
            c2268Vv0 = (C2268Vv0) cVar2.L$0;
            try {
                C1795Pt1.b(obj);
                if (Intrinsics.a(c2268Vv0._identityModelStore.getModel().getOnesignalId(), ((C3127cJ1) q91).getOnesignalId())) {
                    D01.setStringProperty$default(c2268Vv0._identityModelStore.getModel(), ((C3127cJ1) q91).getLabel(), ((C3127cJ1) q91).getValue(), "HYDRATE", false, 8, null);
                }
            } catch (C7063up e3) {
                e = e3;
                i = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                    return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i != 3) {
                    return new T90(U90.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 4) {
                    return new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i == 5) {
                    throw new C6489s51();
                }
                if (e.getStatusCode() != 404 && c2268Vv0._newRecordState.isInMissingRetryWindow(((C3127cJ1) q91).getOnesignalId())) {
                    return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                C3127cJ1 c3127cJ2 = (C3127cJ1) q91;
                List<Q91> rebuildOperationsIfCurrentUser2 = c2268Vv0._buildUserService.getRebuildOperationsIfCurrentUser(c3127cJ2.getAppId(), c3127cJ2.getOnesignalId());
                return rebuildOperationsIfCurrentUser2 == null ? new T90(U90.FAIL_NORETRY, null, null, null, 14, null) : new T90(U90.FAIL_RETRY, null, rebuildOperationsIfCurrentUser2, e.getRetryAfterSeconds(), 2, null);
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q92 = (Q91) cVar2.L$1;
            c2268Vv1 = (C2268Vv0) cVar2.L$0;
            try {
                C1795Pt1.b(obj);
                if (Intrinsics.a(c2268Vv1._identityModelStore.getModel().getOnesignalId(), ((C4684jX) q92).getOnesignalId())) {
                    D01.setOptStringProperty$default(c2268Vv1._identityModelStore.getModel(), ((C4684jX) q92).getLabel(), null, "HYDRATE", false, 8, null);
                }
            } catch (C7063up e4) {
                e = e4;
                i2 = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i2 != 1) {
                    return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i2 != 2) {
                    return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i2 != 3) {
                    return new T90(U90.SUCCESS, null, null, null, 14, null);
                }
                if (i2 != 4) {
                    return new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i2 == 5) {
                    if (e.getStatusCode() == 404) {
                    }
                }
                throw new C6489s51();
            }
        }
        return new T90(U90.SUCCESS, null, null, null, 14, null);
    }

    @Override // defpackage.InterfaceC3669eu0
    @NotNull
    public List<String> getOperations() {
        return WE.f(SET_ALIAS, DELETE_ALIAS);
    }
}
