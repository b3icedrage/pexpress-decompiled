package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020#0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lfq1;", "Leu0;", "Lmv0;", "_userBackend", "LTv0;", "_identityModelStore", "Lqj1;", "_propertiesModelStore", "LBU1;", "_subscriptionsModelStore", "LxI;", "_configModelStore", "Lzu0;", "_buildUserService", "Lx41;", "_newRecordState", "<init>", "(Lmv0;LTv0;Lqj1;LBU1;LxI;Lzu0;Lx41;)V", "Leq1;", "op", "LT90;", "getUser", "(Leq1;LJM;)Ljava/lang/Object;", "", "LQ91;", "operations", "execute", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "Lmv0;", "LTv0;", "Lqj1;", "LBU1;", "LxI;", "Lzu0;", "Lx41;", "", "getOperations", "()Ljava/util/List;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3868fq1 implements InterfaceC3669eu0 {

    @NotNull
    public static final String REFRESH_USER = "refresh-user";

    @NotNull
    private final InterfaceC8130zu0 _buildUserService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final C7536x41 _newRecordState;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final BU1 _subscriptionsModelStore;

    @NotNull
    private final InterfaceC5403mv0 _userBackend;

    /* JADX INFO: renamed from: fq1$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EU1.values().length];
            iArr[EU1.EMAIL.ordinal()] = 1;
            iArr[EU1.SMS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C5013l41.a.values().length];
            iArr2[C5013l41.a.RETRYABLE.ordinal()] = 1;
            iArr2[C5013l41.a.UNAUTHORIZED.ordinal()] = 2;
            iArr2[C5013l41.a.MISSING.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: fq1$c */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.RefreshUserOperationExecutor", f = "RefreshUserOperationExecutor.kt", l = {58}, m = "getUser")
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
            return C3868fq1.this.getUser(null, this);
        }
    }

    public C3868fq1(@NotNull InterfaceC5403mv0 _userBackend, @NotNull C2112Tv0 _identityModelStore, @NotNull C6204qj1 _propertiesModelStore, @NotNull BU1 _subscriptionsModelStore, @NotNull C7582xI _configModelStore, @NotNull InterfaceC8130zu0 _buildUserService, @NotNull C7536x41 _newRecordState) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x024d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0250  */
    /* JADX WARN: Code duplicated, block: B:109:0x025f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0293  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e A[Catch: up -> 0x0036, LOOP:0: B:30:0x0098->B:32:0x009e, LOOP_END, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00db A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0106 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x012f A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x014d A[Catch: up -> 0x0036, TRY_LEAVE, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0176 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x017b A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0187 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x019f A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5 A[Catch: up -> 0x0036, TryCatch #2 {up -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:49:0x012f, B:50:0x013a, B:51:0x0147, B:53:0x014d, B:57:0x016b, B:59:0x0176, B:61:0x0181, B:63:0x0187, B:64:0x0189, B:67:0x019f, B:70:0x01a7, B:72:0x01b2, B:76:0x01bd, B:79:0x01c7, B:82:0x01d1, B:85:0x01db, B:89:0x01e6, B:91:0x01f1, B:68:0x01a2, B:69:0x01a5, B:60:0x017b, B:92:0x01f6, B:94:0x0204, B:96:0x020e, B:97:0x0211), top: B:127:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object getUser(C3658eq1 c3658eq1, JM<? super T90> jm) {
        c cVar;
        C3658eq1 c3658eq2;
        C3868fq1 c3868fq1;
        C3658eq1 c3658eq3;
        int i;
        QP qp;
        C2034Sv0 c2034Sv0;
        C5994pj1 c5994pj1;
        ArrayList arrayList;
        String pushSubscriptionId;
        AU1 au1;
        AU1 au2;
        String token;
        String str;
        Integer notificationTypes;
        int value;
        GU1 gu1FromInt;
        int i2;
        HU1 hu1;
        boolean z;
        String sdk;
        String deviceOS;
        String carrier;
        String appVersion;
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
        Object user = cVar.result;
        MN mn = MN.d;
        int i4 = cVar.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3658eq3 = (C3658eq1) cVar.L$1;
            c3868fq1 = (C3868fq1) cVar.L$0;
            try {
                C1795Pt1.b(user);
                qp = (QP) user;
                if (!Intrinsics.a(c3658eq3.getOnesignalId(), c3868fq1._identityModelStore.getModel().getOnesignalId())) {
                    return new T90(U90.SUCCESS, null, null, null, 14, null);
                }
                c2034Sv0 = new C2034Sv0();
                for (Map.Entry<String, String> entry : qp.getIdentities().entrySet()) {
                    c2034Sv0.put(entry.getKey(), entry.getValue());
                }
                c5994pj1 = new C5994pj1();
                c5994pj1.setOnesignalId(c3658eq3.getOnesignalId());
                if (qp.getProperties().getCountry() != null) {
                    c5994pj1.setCountry(qp.getProperties().getCountry());
                }
                if (qp.getProperties().getLanguage() != null) {
                    c5994pj1.setLanguage(qp.getProperties().getLanguage());
                }
                if (qp.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : qp.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            HW0<String> tags = c5994pj1.getTags();
                            String key = entry2.getKey();
                            String value2 = entry2.getValue();
                            Intrinsics.checkNotNull(value2);
                            tags.put(key, value2);
                        }
                    }
                }
                if (qp.getProperties().getTimezoneId() != null) {
                    c5994pj1.setTimezone(qp.getProperties().getTimezoneId());
                }
                arrayList = new ArrayList();
                for (DU1 du1 : qp.getSubscriptions()) {
                    au2 = new AU1();
                    String id = du1.getId();
                    Intrinsics.checkNotNull(id);
                    au2.setId(id);
                    token = du1.getToken();
                    str = "";
                    if (token == null) {
                        token = "";
                    }
                    au2.setAddress(token);
                    GU1.Companion companion = GU1.INSTANCE;
                    notificationTypes = du1.getNotificationTypes();
                    if (notificationTypes != null) {
                        value = notificationTypes.intValue();
                    } else {
                        value = GU1.SUBSCRIBED.getValue();
                    }
                    gu1FromInt = companion.fromInt(value);
                    if (gu1FromInt == null) {
                        gu1FromInt = GU1.SUBSCRIBED;
                    }
                    au2.setStatus(gu1FromInt);
                    EU1 type = du1.getType();
                    Intrinsics.checkNotNull(type);
                    i2 = b.$EnumSwitchMapping$0[type.ordinal()];
                    if (i2 != 1) {
                        hu1 = HU1.EMAIL;
                    } else if (i2 != 2) {
                        hu1 = HU1.PUSH;
                    } else {
                        hu1 = HU1.SMS;
                    }
                    au2.setType(hu1);
                    if (au2.getStatus() != GU1.UNSUBSCRIBE || au2.getStatus() == GU1.DISABLED_FROM_REST_API_DEFAULT_REASON) {
                        z = false;
                    } else {
                        z = true;
                    }
                    au2.setOptedIn(z);
                    sdk = du1.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    au2.setSdk(sdk);
                    deviceOS = du1.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    au2.setDeviceOS(deviceOS);
                    carrier = du1.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    au2.setCarrier(carrier);
                    appVersion = du1.getAppVersion();
                    if (appVersion == null) {
                        str = appVersion;
                    }
                    au2.setAppVersion(str);
                    if (au2.getType() != HU1.PUSH) {
                        arrayList.add(au2);
                    }
                }
                pushSubscriptionId = c3868fq1._configModelStore.getModel().getPushSubscriptionId();
                if (pushSubscriptionId != null && (au1 = (AU1) c3868fq1._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(au1);
                }
                c3868fq1._identityModelStore.replace(c2034Sv0, "HYDRATE");
                c3868fq1._propertiesModelStore.replace(c5994pj1, "HYDRATE");
                c3868fq1._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new T90(U90.SUCCESS, null, null, null, 14, null);
            } catch (C7063up e) {
                e = e;
                i = b.$EnumSwitchMapping$1[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                    return new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 3) {
                    return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404) {
                }
                List<Q91> rebuildOperationsIfCurrentUser = c3868fq1._buildUserService.getRebuildOperationsIfCurrentUser(c3658eq3.getAppId(), c3658eq3.getOnesignalId());
                return rebuildOperationsIfCurrentUser == null ? new T90(U90.FAIL_NORETRY, null, null, null, 14, null) : new T90(U90.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
            }
        }
        C1795Pt1.b(user);
        try {
            InterfaceC5403mv0 interfaceC5403mv0 = this._userBackend;
            String appId = c3658eq1.getAppId();
            String onesignalId = c3658eq1.getOnesignalId();
            cVar.L$0 = this;
            c3658eq2 = c3658eq1;
            try {
                cVar.L$1 = c3658eq2;
                cVar.label = 1;
                user = interfaceC5403mv0.getUser(appId, "onesignal_id", onesignalId, cVar);
                if (user == mn) {
                    return mn;
                }
                c3868fq1 = this;
                c3658eq3 = c3658eq2;
                qp = (QP) user;
                if (!Intrinsics.a(c3658eq3.getOnesignalId(), c3868fq1._identityModelStore.getModel().getOnesignalId())) {
                    return new T90(U90.SUCCESS, null, null, null, 14, null);
                }
                c2034Sv0 = new C2034Sv0();
                while (r8.hasNext()) {
                    c2034Sv0.put(entry.getKey(), entry.getValue());
                }
                c5994pj1 = new C5994pj1();
                c5994pj1.setOnesignalId(c3658eq3.getOnesignalId());
                if (qp.getProperties().getCountry() != null) {
                    c5994pj1.setCountry(qp.getProperties().getCountry());
                }
                if (qp.getProperties().getLanguage() != null) {
                    c5994pj1.setLanguage(qp.getProperties().getLanguage());
                }
                if (qp.getProperties().getTags() != null) {
                    while (r9.hasNext()) {
                        if (entry2.getValue() != null) {
                            HW0<String> tags2 = c5994pj1.getTags();
                            String key2 = entry2.getKey();
                            String value3 = entry2.getValue();
                            Intrinsics.checkNotNull(value3);
                            tags2.put(key2, value3);
                        }
                    }
                }
                if (qp.getProperties().getTimezoneId() != null) {
                    c5994pj1.setTimezone(qp.getProperties().getTimezoneId());
                }
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    au2 = new AU1();
                    String id2 = du1.getId();
                    Intrinsics.checkNotNull(id2);
                    au2.setId(id2);
                    token = du1.getToken();
                    str = "";
                    if (token == null) {
                        token = "";
                    }
                    au2.setAddress(token);
                    GU1.Companion companion2 = GU1.INSTANCE;
                    notificationTypes = du1.getNotificationTypes();
                    if (notificationTypes != null) {
                        value = notificationTypes.intValue();
                    } else {
                        value = GU1.SUBSCRIBED.getValue();
                    }
                    gu1FromInt = companion2.fromInt(value);
                    if (gu1FromInt == null) {
                        gu1FromInt = GU1.SUBSCRIBED;
                    }
                    au2.setStatus(gu1FromInt);
                    EU1 type2 = du1.getType();
                    Intrinsics.checkNotNull(type2);
                    i2 = b.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i2 != 1) {
                        hu1 = HU1.EMAIL;
                    } else if (i2 != 2) {
                        hu1 = HU1.PUSH;
                    } else {
                        hu1 = HU1.SMS;
                    }
                    au2.setType(hu1);
                    if (au2.getStatus() != GU1.UNSUBSCRIBE) {
                        z = false;
                    } else {
                        z = false;
                    }
                    au2.setOptedIn(z);
                    sdk = du1.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    au2.setSdk(sdk);
                    deviceOS = du1.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    au2.setDeviceOS(deviceOS);
                    carrier = du1.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    au2.setCarrier(carrier);
                    appVersion = du1.getAppVersion();
                    if (appVersion == null) {
                        str = appVersion;
                    }
                    au2.setAppVersion(str);
                    if (au2.getType() != HU1.PUSH) {
                        arrayList.add(au2);
                    }
                }
                pushSubscriptionId = c3868fq1._configModelStore.getModel().getPushSubscriptionId();
                if (pushSubscriptionId != null) {
                    arrayList.add(au1);
                }
                c3868fq1._identityModelStore.replace(c2034Sv0, "HYDRATE");
                c3868fq1._propertiesModelStore.replace(c5994pj1, "HYDRATE");
                c3868fq1._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new T90(U90.SUCCESS, null, null, null, 14, null);
            } catch (C7063up e2) {
                e = e2;
                c3868fq1 = this;
                c3658eq3 = c3658eq2;
                i = b.$EnumSwitchMapping$1[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                    return new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 3) {
                    return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404 && c3868fq1._newRecordState.isInMissingRetryWindow(c3658eq3.getOnesignalId())) {
                    return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                List<Q91> rebuildOperationsIfCurrentUser2 = c3868fq1._buildUserService.getRebuildOperationsIfCurrentUser(c3658eq3.getAppId(), c3658eq3.getOnesignalId());
                if (rebuildOperationsIfCurrentUser2 == null) {
                }
            }
        } catch (C7063up e3) {
            e = e3;
            c3658eq2 = c3658eq1;
        }
    }

    @Override // defpackage.InterfaceC3669eu0
    @Nullable
    public Object execute(@NotNull List<? extends Q91> list, @NotNull JM<? super T90> jm) throws Exception {
        NS0.log(EnumC5513nS0.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((Q91) it.next()) instanceof C3658eq1)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        Q91 q91 = (Q91) CollectionsKt.F(list);
        if (q91 instanceof C3658eq1) {
            return getUser((C3658eq1) q91, jm);
        }
        throw new Exception("Unrecognized operation: " + q91);
    }

    @Override // defpackage.InterfaceC3669eu0
    @NotNull
    public List<String> getOperations() {
        return VE.c(REFRESH_USER);
    }
}
