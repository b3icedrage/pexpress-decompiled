package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.onesignal.common.AndroidUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: s61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0018J#\u0010&\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b,\u0010 J;\u00105\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u00104\u001a\u000203H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u0002012\u0006\u00107\u001a\u000201¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Ls61;", "LKt0;", "LWr0;", "_applicationService", "LJt0;", "_notificationDisplayer", "LxI;", "_configModelStore", "LVt0;", "_dataController", "Lau0;", "_notificationSummaryManager", "LOt0;", "_lifecycleService", "Lgv0;", "_time", "<init>", "(LWr0;LJt0;LxI;LVt0;Lau0;LOt0;Lgv0;)V", "Lr61;", "notificationJob", "", "wantsToDisplay", "isRestoring", "processHandlerResponse", "(Lr61;ZZLJM;)Ljava/lang/Object;", "LO51;", "notification", "isNotificationWithinTTL", "(LO51;)Z", "isDuplicateNotification", "(LO51;LJM;)Ljava/lang/Object;", "shouldDisplayNotification", "(Lr61;)Z", "wasOpened", "wasDisplayed", "", "postProcessNotification", "opened", "saveNotification", "(Lr61;ZLJM;)Ljava/lang/Object;", "notifiJob", "markNotificationAsDismissed", "(Lr61;LJM;)Ljava/lang/Object;", "processCollapseKey", "shouldFireForegroundHandlers", "Landroid/content/Context;", "context", "", "androidNotificationId", "Lorg/json/JSONObject;", "jsonPayload", "", "timestamp", "processNotificationData", "(Landroid/content/Context;ILorg/json/JSONObject;ZJLJM;)Ljava/lang/Object;", "jsonObject", "getCustomJSONObject", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "LWr0;", "LJt0;", "LxI;", "LVt0;", "Lau0;", "LOt0;", "Lgv0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6493s61 implements InterfaceC1402Kt0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC2262Vt0 _dataController;

    @NotNull
    private final InterfaceC1716Ot0 _lifecycleService;

    @NotNull
    private final InterfaceC1324Jt0 _notificationDisplayer;

    @NotNull
    private final InterfaceC2831au0 _notificationSummaryManager;

    @NotNull
    private final InterfaceC4092gv0 _time;

    /* JADX INFO: renamed from: s61$a */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {304, 307}, m = "markNotificationAsDismissed")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6493s61.this.markNotificationAsDismissed(null, this);
        }
    }

    /* JADX INFO: renamed from: s61$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {230, 234, 238}, m = "postProcessNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6493s61.this.postProcessNotification(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: s61$c */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {319}, m = "processCollapseKey")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
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
            return C6493s61.this.processCollapseKey(null, this);
        }
    }

    /* JADX INFO: renamed from: s61$d */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {171, 189, 194}, m = "processHandlerResponse")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6493s61.this.processHandlerResponse(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: s61$e */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {49, 57, 72, 94, 105, 129, 136, 142, 148}, m = "processNotificationData")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(JM<? super e> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6493s61.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: s61$f */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2", f = "NotificationGenerationProcessor.kt", l = {85}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ O51 $notification;
        final /* synthetic */ Q61 $notificationReceivedEvent;
        final /* synthetic */ C2512Yo1 $wantsToDisplay;
        int label;

        /* JADX INFO: renamed from: s61$f$a */
        @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2$1", f = "NotificationGenerationProcessor.kt", l = {83}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            final /* synthetic */ O51 $notification;
            final /* synthetic */ Q61 $notificationReceivedEvent;
            final /* synthetic */ C2512Yo1 $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ C6493s61 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6493s61 c6493s61, Q61 q61, C2512Yo1 c2512Yo1, O51 o51, JM<? super a> jm) {
                super(2, jm);
                this.this$0 = c6493s61;
                this.$notificationReceivedEvent = q61;
                this.$wantsToDisplay = c2512Yo1;
                this.$notification = o51;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                C2512Yo1 c2512Yo1;
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.d = false;
                    } else if (this.$notificationReceivedEvent.getIsPreventDefault()) {
                        C2512Yo1 c2512Yo2 = this.$wantsToDisplay;
                        c2512Yo2.d = false;
                        C8079zf2<Boolean> displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = c2512Yo2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == mn) {
                            return mn;
                        }
                        c2512Yo1 = c2512Yo2;
                        obj = objWaitForWake;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2512Yo1 = (C2512Yo1) this.L$0;
                C1795Pt1.b(obj);
                c2512Yo1.d = ((Boolean) obj).booleanValue();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Q61 q61, C2512Yo1 c2512Yo1, O51 o51, JM<? super f> jm) {
            super(2, jm);
            this.$notificationReceivedEvent = q61;
            this.$wantsToDisplay = c2512Yo1;
            this.$notification = o51;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C6493s61.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2936bP1 c2936bP1K = C5189lv.k(C6215qm0.d, C6266r20.c, new a(C6493s61.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null), 2);
                this.label = 1;
                if (c2936bP1K.b1(this) == mn) {
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

    /* JADX INFO: renamed from: s61$g */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3", f = "NotificationGenerationProcessor.kt", l = {118}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ O51 $notification;
        final /* synthetic */ V61 $notificationWillDisplayEvent;
        final /* synthetic */ C2512Yo1 $wantsToDisplay;
        int label;

        /* JADX INFO: renamed from: s61$g$a */
        @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3$1", f = "NotificationGenerationProcessor.kt", l = {116}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            final /* synthetic */ O51 $notification;
            final /* synthetic */ V61 $notificationWillDisplayEvent;
            final /* synthetic */ C2512Yo1 $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ C6493s61 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6493s61 c6493s61, V61 v61, C2512Yo1 c2512Yo1, O51 o51, JM<? super a> jm) {
                super(2, jm);
                this.this$0 = c6493s61;
                this.$notificationWillDisplayEvent = v61;
                this.$wantsToDisplay = c2512Yo1;
                this.$notification = o51;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                C2512Yo1 c2512Yo1;
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.d = false;
                    } else if (this.$notificationWillDisplayEvent.getIsPreventDefault()) {
                        C2512Yo1 c2512Yo2 = this.$wantsToDisplay;
                        c2512Yo2.d = false;
                        C8079zf2<Boolean> displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = c2512Yo2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == mn) {
                            return mn;
                        }
                        c2512Yo1 = c2512Yo2;
                        obj = objWaitForWake;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2512Yo1 = (C2512Yo1) this.L$0;
                C1795Pt1.b(obj);
                c2512Yo1.d = ((Boolean) obj).booleanValue();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(V61 v61, C2512Yo1 c2512Yo1, O51 o51, JM<? super g> jm) {
            super(2, jm);
            this.$notificationWillDisplayEvent = v61;
            this.$wantsToDisplay = c2512Yo1;
            this.$notification = o51;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C6493s61.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2936bP1 c2936bP1K = C5189lv.k(C6215qm0.d, C6266r20.c, new a(C6493s61.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null), 2);
                this.label = 1;
                if (c2936bP1K.b1(this) == mn) {
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

    /* JADX INFO: renamed from: s61$h */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {279}, m = "saveNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        int label;
        /* synthetic */ Object result;

        public h(JM<? super h> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6493s61.this.saveNotification(null, false, this);
        }
    }

    public C6493s61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1324Jt0 _notificationDisplayer, @NotNull C7582xI _configModelStore, @NotNull InterfaceC2262Vt0 _dataController, @NotNull InterfaceC2831au0 _notificationSummaryManager, @NotNull InterfaceC1716Ot0 _lifecycleService, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._configModelStore = _configModelStore;
        this._dataController = _dataController;
        this._notificationSummaryManager = _notificationSummaryManager;
        this._lifecycleService = _lifecycleService;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(O51 o51, JM<? super Boolean> jm) {
        return this._dataController.doesNotificationExist(o51.getNotificationId(), jm);
    }

    private final boolean isNotificationWithinTTL(O51 notification) {
        if (this._configModelStore.getModel().getRestoreTTLFilter()) {
            return notification.getSentTime() + ((long) notification.getTtl()) > this._time.getCurrentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r8.updatePossibleDependentSummaryOnDismiss(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markNotificationAsDismissed(defpackage.C6283r61 r7, defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C6493s61.a
            if (r0 == 0) goto L13
            r0 = r8
            s61$a r0 = (defpackage.C6493s61.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            s61$a r0 = new s61$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            defpackage.C1795Pt1.b(r8)
            goto L8b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.L$1
            r61 r7 = (defpackage.C6283r61) r7
            java.lang.Object r2 = r0.L$0
            s61 r2 = (defpackage.C6493s61) r2
            defpackage.C1795Pt1.b(r8)
            goto L70
        L3f:
            defpackage.C1795Pt1.b(r8)
            boolean r8 = r7.getIsNotificationToDisplay()
            if (r8 != 0) goto L4b
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L4b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "Marking restored or disabled notifications as dismissed: "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            defpackage.NS0.debug$default(r8, r5, r4, r5)
            Vt0 r8 = r6._dataController
            int r2 = r7.getAndroidId()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r8.markAsDismissed(r2, r0)
            if (r8 != r1) goto L6f
            goto L8a
        L6f:
            r2 = r6
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8e
            au0 r8 = r2._notificationSummaryManager
            int r7 = r7.getAndroidId()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r8.updatePossibleDependentSummaryOnDismiss(r7, r0)
            if (r7 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L8e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6493s61.markNotificationAsDismissed(r61, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r8.markNotificationAsDismissed(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r8.notificationReceived(r7, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postProcessNotification(defpackage.C6283r61 r7, boolean r8, boolean r9, defpackage.JM<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C6493s61.b
            if (r0 == 0) goto L13
            r0 = r10
            s61$b r0 = (defpackage.C6493s61.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            s61$b r0 = new s61$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r10)
            goto L7c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.C1795Pt1.b(r10)
            goto L6a
        L39:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            r61 r7 = (defpackage.C6283r61) r7
            java.lang.Object r8 = r0.L$0
            s61 r8 = (defpackage.C6493s61) r8
            defpackage.C1795Pt1.b(r10)
            goto L5a
        L47:
            defpackage.C1795Pt1.b(r10)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.Z$0 = r9
            r0.label = r5
            java.lang.Object r8 = r6.saveNotification(r7, r8, r0)
            if (r8 != r1) goto L59
            goto L7b
        L59:
            r8 = r6
        L5a:
            r10 = 0
            if (r9 != 0) goto L6d
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r7 = r8.markNotificationAsDismissed(r7, r0)
            if (r7 != r1) goto L6a
            goto L7b
        L6a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L6d:
            Ot0 r8 = r8._lifecycleService
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r7 = r8.notificationReceived(r7, r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6493s61.postProcessNotification(r61, boolean, boolean, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processCollapseKey(C6283r61 c6283r61, JM<? super Unit> jm) {
        c cVar;
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
        Object androidIdFromCollapseKey = cVar.result;
        MN mn = MN.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            C1795Pt1.b(androidIdFromCollapseKey);
            if (c6283r61.getIsRestoring()) {
                return Unit.a;
            }
            if (!c6283r61.getJsonPayload().has("collapse_key") || "do_not_collapse".equals(c6283r61.getJsonPayload().optString("collapse_key"))) {
                return Unit.a;
            }
            String collapseId = c6283r61.getJsonPayload().optString("collapse_key");
            InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
            Intrinsics.checkNotNullExpressionValue(collapseId, "collapseId");
            cVar.L$0 = c6283r61;
            cVar.label = 1;
            androidIdFromCollapseKey = interfaceC2262Vt0.getAndroidIdFromCollapseKey(collapseId, cVar);
            if (androidIdFromCollapseKey == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6283r61 = (C6283r61) cVar.L$0;
            C1795Pt1.b(androidIdFromCollapseKey);
        }
        Integer num = (Integer) androidIdFromCollapseKey;
        if (num != null) {
            c6283r61.getNotification().setAndroidNotificationId(num.intValue());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processHandlerResponse(C6283r61 c6283r61, boolean z, boolean z2, JM<? super Boolean> jm) {
        d dVar;
        C6493s61 c6493s61;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i2 = dVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            if (z) {
                boolean zIsStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(c6283r61.getNotification().getBody());
                boolean zIsNotificationWithinTTL = isNotificationWithinTTL(c6283r61.getNotification());
                if (zIsStringNotEmpty && zIsNotificationWithinTTL) {
                    dVar.L$0 = this;
                    dVar.L$1 = c6283r61;
                    dVar.label = 1;
                    if (processCollapseKey(c6283r61, dVar) != mn) {
                        c6493s61 = this;
                    }
                } else if (z2) {
                    dVar.label = 2;
                    if (markNotificationAsDismissed(c6283r61, dVar) == mn) {
                        return null;
                    }
                } else {
                    c6283r61.setNotificationToDisplay(false);
                    dVar.label = 3;
                    if (postProcessNotification(c6283r61, true, false, dVar) == mn) {
                        return null;
                    }
                }
            } else if (z2) {
                dVar.label = 2;
                if (markNotificationAsDismissed(c6283r61, dVar) == mn) {
                    return null;
                }
            } else {
                c6283r61.setNotificationToDisplay(false);
                dVar.label = 3;
                if (postProcessNotification(c6283r61, true, false, dVar) == mn) {
                    return null;
                }
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return null;
        }
        c6283r61 = (C6283r61) dVar.L$1;
        c6493s61 = (C6493s61) dVar.L$0;
        C1795Pt1.b(obj);
        if (!c6493s61.shouldDisplayNotification(c6283r61)) {
            return Boolean.FALSE;
        }
        c6283r61.setNotificationToDisplay(true);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object saveNotification(C6283r61 c6283r61, boolean z, JM<? super Unit> jm) {
        h hVar;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i = hVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.label = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        Object obj = hVar.result;
        MN mn = MN.d;
        int i2 = hVar.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                NS0.debug$default("Saving Notification job: " + c6283r61, null, 2, null);
                JSONObject jsonPayload = c6283r61.getJsonPayload();
                JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                String strOptString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                long jOptLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + ((long) jsonPayload.optInt("google.ttl", 259200));
                InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
                String strOptString2 = customJSONObject.optString("i");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "customJSON.optString(\"i\")");
                String strSafeString = JD0.safeString(jsonPayload, "grp");
                boolean isNotificationToDisplay = c6283r61.getIsNotificationToDisplay();
                int androidId = c6283r61.getAndroidId();
                String strValueOf = c6283r61.getTitle() != null ? String.valueOf(c6283r61.getTitle()) : null;
                String strValueOf2 = c6283r61.getBody() != null ? String.valueOf(c6283r61.getBody()) : null;
                String string = jsonPayload.toString();
                Intrinsics.checkNotNullExpressionValue(string, "jsonPayload.toString()");
                hVar.label = 1;
                if (interfaceC2262Vt0.createNotification(strOptString2, strSafeString, strOptString, isNotificationToDisplay, z, androidId, strValueOf, strValueOf2, jOptLong, string, hVar) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return Unit.a;
    }

    private final boolean shouldDisplayNotification(C6283r61 notificationJob) {
        return notificationJob.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(notificationJob.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(C6283r61 notificationJob) {
        if (!this._applicationService.isInForeground()) {
            NS0.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!notificationJob.getIsRestoring()) {
            return true;
        }
        NS0.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    @NotNull
    public final JSONObject getCustomJSONObject(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString("custom"));
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:132:0x0303  */
    /* JADX WARN: Code duplicated, block: B:135:0x030b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x030e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0325 A[DONT_INVERT, PHI: r0
      0x0325: PHI (r0v68 boolean) = (r0v64 boolean), (r0v64 boolean), (r0v72 boolean) binds: [B:134:0x0309, B:139:0x0322, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0327  */
    /* JADX WARN: Code duplicated, block: B:147:0x033f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0342  */
    /* JADX WARN: Code duplicated, block: B:40:0x012d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x014f  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166 A[PHI: r0 r2 r7 r8 r13 r14
      0x0166: PHI (r0v5 boolean) = (r0v2 boolean), (r0v19 boolean) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r2v9 O51) = (r2v7 O51), (r2v14 O51) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r7v5 s61) = (r7v2 s61), (r7v10 s61) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r8v4 org.json.JSONObject) = (r8v1 org.json.JSONObject), (r8v6 org.json.JSONObject) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r13v6 android.content.Context) = (r13v2 android.content.Context), (r13v16 android.content.Context) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r14v6 long) = (r14v1 long), (r14v12 long) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0218  */
    /* JADX WARN: Code duplicated, block: B:85:0x021f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0225  */
    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:97:0x026d  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c3, code lost:
    
        if (r8 == r4) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0339, code lost:
    
        if (defpackage.IW.b(100, r3) == r4) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // defpackage.InterfaceC1402Kt0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object processNotificationData(@org.jetbrains.annotations.NotNull android.content.Context r20, int r21, @org.jetbrains.annotations.NotNull org.json.JSONObject r22, boolean r23, long r24, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6493s61.processNotificationData(android.content.Context, int, org.json.JSONObject, boolean, long, JM):java.lang.Object");
    }
}
