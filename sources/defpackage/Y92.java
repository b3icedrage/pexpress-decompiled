package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"LY92;", "Leu0;", "Lmv0;", "_userBackend", "LTv0;", "_identityModelStore", "Lqj1;", "_propertiesModelStore", "Lzu0;", "_buildUserService", "Lx41;", "_newRecordState", "Lls0;", "_consistencyManager", "<init>", "(Lmv0;LTv0;Lqj1;Lzu0;Lx41;Lls0;)V", "", "LQ91;", "operations", "LT90;", "execute", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "Lmv0;", "LTv0;", "Lqj1;", "Lzu0;", "Lx41;", "Lls0;", "", "getOperations", "()Ljava/util/List;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Y92 implements InterfaceC3669eu0 {

    @NotNull
    public static final String DELETE_TAG = "delete-tag";

    @NotNull
    public static final String SET_PROPERTY = "set-property";

    @NotNull
    public static final String SET_TAG = "set-tag";

    @NotNull
    public static final String TRACK_PURCHASE = "track-purchase";

    @NotNull
    public static final String TRACK_SESSION_END = "track-session-end";

    @NotNull
    public static final String TRACK_SESSION_START = "track-session-start";

    @NotNull
    private final InterfaceC8130zu0 _buildUserService;

    @NotNull
    private final InterfaceC5181ls0 _consistencyManager;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final C7536x41 _newRecordState;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final InterfaceC5403mv0 _userBackend;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C5013l41.a.values().length];
            iArr[C5013l41.a.RETRYABLE.ordinal()] = 1;
            iArr[C5013l41.a.UNAUTHORIZED.ordinal()] = 2;
            iArr[C5013l41.a.MISSING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor", f = "UpdateUserOperationExecutor.kt", l = {142, 152, 154}, m = "execute")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return Y92.this.execute(null, this);
        }
    }

    public Y92(@NotNull InterfaceC5403mv0 _userBackend, @NotNull C2112Tv0 _identityModelStore, @NotNull C6204qj1 _propertiesModelStore, @NotNull InterfaceC8130zu0 _buildUserService, @NotNull C7536x41 _newRecordState, @NotNull InterfaceC5181ls0 _consistencyManager) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c5 A[Catch: up -> 0x0048, TryCatch #2 {up -> 0x0048, blocks: (B:15:0x0043, B:98:0x02b3, B:100:0x02c5, B:101:0x02c9, B:103:0x02cf, B:105:0x02d9, B:106:0x02fc, B:108:0x0300, B:109:0x031d, B:111:0x0321), top: B:142:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02cf A[Catch: up -> 0x0048, TryCatch #2 {up -> 0x0048, blocks: (B:15:0x0043, B:98:0x02b3, B:100:0x02c5, B:101:0x02c9, B:103:0x02cf, B:105:0x02d9, B:106:0x02fc, B:108:0x0300, B:109:0x031d, B:111:0x0321), top: B:142:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0357  */
    /* JADX WARN: Code duplicated, block: B:119:0x035a  */
    /* JADX WARN: Code duplicated, block: B:121:0x035d  */
    /* JADX WARN: Code duplicated, block: B:122:0x036b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0373  */
    /* JADX WARN: Code duplicated, block: B:130:0x0393  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0283 A[Catch: up -> 0x007d, TryCatch #1 {up -> 0x007d, blocks: (B:23:0x0078, B:89:0x027f, B:91:0x0283, B:95:0x029d), top: B:141:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0298  */
    /* JADX WARN: Code duplicated, block: B:95:0x029d A[Catch: up -> 0x007d, TRY_LEAVE, TryCatch #1 {up -> 0x007d, blocks: (B:23:0x0078, B:89:0x027f, B:91:0x0283, B:95:0x029d), top: B:141:0x0078 }] */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02b0, code lost:
    
        if (r2.resolveConditionsWithID(defpackage.C6243qv0.ID, r11) == r3) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC3669eu0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull java.util.List<? extends defpackage.Q91> r25, @org.jetbrains.annotations.NotNull defpackage.JM<? super defpackage.T90> r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Y92.execute(java.util.List, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3669eu0
    @NotNull
    public List<String> getOperations() {
        return WE.f(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
