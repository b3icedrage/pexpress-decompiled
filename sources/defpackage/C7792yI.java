package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001e"}, d2 = {"LyI;", "LYu0;", "LTu0;", "LwI;", "LxI;", "_configModelStore", "Lmu0;", "_paramsBackendService", "Lcv0;", "_subscriptionManager", "<init>", "(LxI;Lmu0;Lcv0;)V", "", "fetchParams", "()V", "start", "LH01;", "args", "", "tag", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "model", "onModelReplaced", "(LwI;Ljava/lang/String;)V", "LxI;", "Lmu0;", "Lcv0;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7792yI implements InterfaceC2529Yu0, InterfaceC2109Tu0<C7371wI> {
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC5400mu0 _paramsBackendService;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;

    /* JADX INFO: renamed from: yI$b */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.config.impl.ConfigModelStoreListener$fetchParams$1", f = "ConfigModelStoreListener.kt", l = {70, 120}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ C7792yI this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, C7792yI c7792yI, JM<? super b> jm) {
            super(1, jm);
            this.$appId = str;
            this.this$0 = c7792yI;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new b(this.$appId, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0061  */
        /* JADX WARN: Code duplicated, block: B:21:0x0070  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d0 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00dd A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00ea A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f7 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x0104 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0111 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x011e A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x012b A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0138 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0145 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0156 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0167 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x017c A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0191 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x01a6 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x01bb A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x01d0 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01e5 A[Catch: up -> 0x0027, TryCatch #1 {up -> 0x0027, blocks: (B:22:0x0073, B:24:0x00d0, B:25:0x00d7, B:27:0x00dd, B:28:0x00e4, B:30:0x00ea, B:31:0x00f1, B:33:0x00f7, B:34:0x00fe, B:36:0x0104, B:37:0x010b, B:39:0x0111, B:40:0x0118, B:42:0x011e, B:43:0x0125, B:45:0x012b, B:46:0x0132, B:48:0x0138, B:49:0x013f, B:51:0x0145, B:52:0x0150, B:54:0x0156, B:55:0x015d, B:57:0x0167, B:58:0x0172, B:60:0x017c, B:61:0x0187, B:63:0x0191, B:64:0x019c, B:66:0x01a6, B:67:0x01b1, B:69:0x01bb, B:70:0x01c6, B:72:0x01d0, B:73:0x01db, B:75:0x01e5, B:76:0x01f0, B:10:0x0023), top: B:96:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0245  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01fb -> B:91:0x0243). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x023e -> B:90:0x0241). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0070
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 584
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7792yI.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C7792yI(@NotNull C7582xI _configModelStore, @NotNull InterfaceC5400mu0 _paramsBackendService, @NotNull InterfaceC3253cv0 _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_paramsBackendService, "_paramsBackendService");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._paramsBackendService = _paramsBackendService;
        this._subscriptionManager = _subscriptionManager;
    }

    private final void fetchParams() {
        String appId = this._configModelStore.getModel().getAppId();
        if (appId.length() == 0) {
            return;
        }
        LY1.suspendifyOnThread$default(0, new b(appId, this, null), 1, null);
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId")) {
            fetchParams();
        }
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._configModelStore.subscribe((InterfaceC2109Tu0) this);
        fetchParams();
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelReplaced(@NotNull C7371wI model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL")) {
            fetchParams();
        }
    }
}
