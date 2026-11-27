package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.INotificationReceivedEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020#2\u0006\u0010\"\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020#2\u0006\u0010'\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u001b\u00101\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u00020#2\u0006\u00104\u001a\u000203H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u00106J#\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0004\b8\u00109J#\u0010:\u001a\u00020#2\u0006\u00107\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020#2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020#2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020D¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\u00020#2\u0006\u00107\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\bH\u0010;R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010LR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010NR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010OR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020!0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020&0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020+0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001c0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001e0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006a"}, d2 = {"Lw61;", "LOt0;", "LCt0;", "LWr0;", "_applicationService", "Lgv0;", "_time", "LxI;", "_configModelStore", "Lct0;", "_influenceManager", "Lcv0;", "_subscriptionManager", "Lws0;", "_deviceService", "LDt0;", "_backend", "LBu0;", "_receiveReceiptWorkManager", "LUr0;", "_analyticsTracker", "<init>", "(LWr0;Lgv0;LxI;Lct0;Lcv0;Lws0;LDt0;LBu0;LUr0;)V", "Landroid/app/Activity;", "context", "", "shouldInitDirectSessionFromNotificationOpen", "(Landroid/app/Activity;)Z", "Lorg/json/JSONArray;", "data", "", "getLatestNotificationId", "(Lorg/json/JSONArray;)Ljava/lang/String;", "LMt0;", "callback", "", "setInternalNotificationLifecycleCallback", "(LMt0;)V", "LNt0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addExternalForegroundLifecycleListener", "(LNt0;)V", "removeExternalForegroundLifecycleListener", "LGt0;", "addExternalClickListener", "(LGt0;)V", "removeExternalClickListener", "Lorg/json/JSONObject;", "jsonPayload", "canReceiveNotification", "(Lorg/json/JSONObject;LJM;)Ljava/lang/Object;", "Lr61;", "notificationJob", "notificationReceived", "(Lr61;LJM;)Ljava/lang/Object;", "activity", "canOpenNotification", "(Landroid/app/Activity;Lorg/json/JSONObject;LJM;)Ljava/lang/Object;", "notificationOpened", "(Landroid/app/Activity;Lorg/json/JSONArray;LJM;)Ljava/lang/Object;", "Lcom/onesignal/notifications/INotificationReceivedEvent;", "notificationReceivedEvent", "externalRemoteNotificationReceived", "(Lcom/onesignal/notifications/INotificationReceivedEvent;)V", "Lbu0;", "willDisplayEvent", "externalNotificationWillShowInForeground", "(Lbu0;)V", "Landroid/content/Context;", "setupNotificationServiceExtension", "(Landroid/content/Context;)V", "pushPayloads", "openDestinationActivity", "LWr0;", "Lgv0;", "LxI;", "Lct0;", "Lcv0;", "Lws0;", "LDt0;", "LBu0;", "LUr0;", "LRx;", "intLifecycleCallback", "LRx;", "LYt0;", "extRemoteReceivedCallback", "LO80;", "extWillShowInForegroundCallback", "LO80;", "extOpenedCallback", "Lqj;", "unprocessedOpenedNotifs", "Lqj;", "", "postedOpenedNotifIds", "Ljava/util/Set;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7333w61 implements InterfaceC1716Ot0, InterfaceC0778Ct0 {

    @NotNull
    private final InterfaceC2178Ur0 _analyticsTracker;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC0856Dt0 _backend;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final InterfaceC3247ct0 _influenceManager;

    @NotNull
    private final InterfaceC0703Bu0 _receiveReceiptWorkManager;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private final O80<InterfaceC1090Gt0> extOpenedCallback;

    @NotNull
    private final C1961Rx<InterfaceC2526Yt0> extRemoteReceivedCallback;

    @NotNull
    private final O80<InterfaceC1638Nt0> extWillShowInForegroundCallback;

    @NotNull
    private final C1961Rx<InterfaceC1557Mt0> intLifecycleCallback;

    @NotNull
    private final Set<String> postedOpenedNotifIds;

    @NotNull
    private final C6202qj<JSONArray> unprocessedOpenedNotifs;

    /* JADX INFO: renamed from: w61$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGt0;", "it", "", "invoke", "(LGt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC1090Gt0, Unit> {
        final /* synthetic */ C3084c61 $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3084c61 c3084c61) {
            super(1);
            this.$openedResult = c3084c61;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1090Gt0 interfaceC1090Gt0) {
            invoke2(interfaceC1090Gt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1090Gt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onClick(this.$openedResult);
        }
    }

    /* JADX INFO: renamed from: w61$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", l = {120}, m = "canOpenNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
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
            return C7333w61.this.canOpenNotification(null, null, this);
        }
    }

    /* JADX INFO: renamed from: w61$c */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canOpenNotification$2", f = "NotificationLifecycleService.kt", l = {120}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMt0;", "it", "", "<anonymous>", "(LMt0;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends AW1 implements Function2<InterfaceC1557Mt0, JM<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C2512Yo1 $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2512Yo1 c2512Yo1, Activity activity, JSONObject jSONObject, JM<? super c> jm) {
            super(2, jm);
            this.$canOpen = c2512Yo1;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            c cVar = new c(this.$canOpen, this.$activity, this.$data, jm);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC1557Mt0 interfaceC1557Mt0, @Nullable JM<? super Unit> jm) {
            return ((c) create(interfaceC1557Mt0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C2512Yo1 c2512Yo1;
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC1557Mt0 interfaceC1557Mt0 = (InterfaceC1557Mt0) this.L$0;
                C2512Yo1 c2512Yo2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = c2512Yo2;
                this.label = 1;
                obj = interfaceC1557Mt0.canOpenNotification(activity, jSONObject, this);
                if (obj == mn) {
                    return mn;
                }
                c2512Yo1 = c2512Yo2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2512Yo1 = (C2512Yo1) this.L$0;
                C1795Pt1.b(obj);
            }
            c2512Yo1.d = ((Boolean) obj).booleanValue();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: w61$d */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", l = {92}, m = "canReceiveNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
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
            return C7333w61.this.canReceiveNotification(null, this);
        }
    }

    /* JADX INFO: renamed from: w61$e */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canReceiveNotification$2", f = "NotificationLifecycleService.kt", l = {92}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMt0;", "it", "", "<anonymous>", "(LMt0;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<InterfaceC1557Mt0, JM<? super Unit>, Object> {
        final /* synthetic */ C2512Yo1 $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2512Yo1 c2512Yo1, JSONObject jSONObject, JM<? super e> jm) {
            super(2, jm);
            this.$canReceive = c2512Yo1;
            this.$jsonPayload = jSONObject;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            e eVar = new e(this.$canReceive, this.$jsonPayload, jm);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC1557Mt0 interfaceC1557Mt0, @Nullable JM<? super Unit> jm) {
            return ((e) create(interfaceC1557Mt0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C2512Yo1 c2512Yo1;
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC1557Mt0 interfaceC1557Mt0 = (InterfaceC1557Mt0) this.L$0;
                C2512Yo1 c2512Yo2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = c2512Yo2;
                this.label = 1;
                obj = interfaceC1557Mt0.canReceiveNotification(jSONObject, this);
                if (obj == mn) {
                    return mn;
                }
                c2512Yo1 = c2512Yo2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2512Yo1 = (C2512Yo1) this.L$0;
                C1795Pt1.b(obj);
            }
            c2512Yo1.d = ((Boolean) obj).booleanValue();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: w61$f */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNt0;", "it", "", "invoke", "(LNt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class f extends ML0 implements Function1<InterfaceC1638Nt0, Unit> {
        final /* synthetic */ InterfaceC3041bu0 $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC3041bu0 interfaceC3041bu0) {
            super(1);
            this.$willDisplayEvent = interfaceC3041bu0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1638Nt0 interfaceC1638Nt0) {
            invoke2(interfaceC1638Nt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1638Nt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onWillDisplay(this.$willDisplayEvent);
        }
    }

    /* JADX INFO: renamed from: w61$g */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYt0;", "it", "", "invoke", "(LYt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class g extends ML0 implements Function1<InterfaceC2526Yt0, Unit> {
        final /* synthetic */ INotificationReceivedEvent $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(INotificationReceivedEvent iNotificationReceivedEvent) {
            super(1);
            this.$notificationReceivedEvent = iNotificationReceivedEvent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2526Yt0 interfaceC2526Yt0) {
            invoke2(interfaceC2526Yt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2526Yt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationReceived(this.$notificationReceivedEvent);
        }
    }

    /* JADX INFO: renamed from: w61$h */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", l = {173}, m = "notificationOpened")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        Object L$1;
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
            return C7333w61.this.notificationOpened(null, null, this);
        }
    }

    /* JADX INFO: renamed from: w61$i */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$2", f = "NotificationLifecycleService.kt", l = {144}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class i extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $appId;
        final /* synthetic */ InterfaceC7494ws0.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3, InterfaceC7494ws0.a aVar, JM<? super i> jm) {
            super(1, jm);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C7333w61.this.new i(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((i) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    InterfaceC0856Dt0 interfaceC0856Dt0 = C7333w61.this._backend;
                    String str = this.$appId;
                    String str2 = this.$notificationId;
                    String str3 = this.$subscriptionId;
                    InterfaceC7494ws0.a aVar = this.$deviceType;
                    this.label = 1;
                    if (interfaceC0856Dt0.updateNotificationAsOpened(str, str2, str3, aVar, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
            } catch (C7063up e) {
                NS0.error$default("Notification opened confirmation failed with statusCode: " + e.getStatusCode() + " response: " + e.getResponse(), null, 2, null);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: w61$j */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGt0;", "it", "", "invoke", "(LGt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class j extends ML0 implements Function1<InterfaceC1090Gt0, Unit> {
        final /* synthetic */ C3084c61 $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C3084c61 c3084c61) {
            super(1);
            this.$openResult = c3084c61;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1090Gt0 interfaceC1090Gt0) {
            invoke2(interfaceC1090Gt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1090Gt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onClick(this.$openResult);
        }
    }

    public C7333w61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC4092gv0 _time, @NotNull C7582xI _configModelStore, @NotNull InterfaceC3247ct0 _influenceManager, @NotNull InterfaceC3253cv0 _subscriptionManager, @NotNull InterfaceC7494ws0 _deviceService, @NotNull InterfaceC0856Dt0 _backend, @NotNull InterfaceC0703Bu0 _receiveReceiptWorkManager, @NotNull InterfaceC2178Ur0 _analyticsTracker) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        Intrinsics.checkNotNullParameter(_analyticsTracker, "_analyticsTracker");
        this._applicationService = _applicationService;
        this._time = _time;
        this._configModelStore = _configModelStore;
        this._influenceManager = _influenceManager;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._backend = _backend;
        this._receiveReceiptWorkManager = _receiveReceiptWorkManager;
        this._analyticsTracker = _analyticsTracker;
        this.intLifecycleCallback = new C1961Rx<>();
        this.extRemoteReceivedCallback = new C1961Rx<>();
        this.extWillShowInForegroundCallback = new O80<>();
        this.extOpenedCallback = new O80<>();
        this.unprocessedOpenedNotifs = new C6202qj<>();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    private final String getLatestNotificationId(JSONArray data) throws JSONException {
        JSONObject jSONObject;
        if (data.length() > 0) {
            Object obj = data.get(0);
            Intrinsics.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return C6074q61.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity context) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return D71.INSTANCE.getShouldOpenActivity(context);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void addExternalClickListener(@NotNull InterfaceC1090Gt0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            C6202qj<JSONArray> c6202qj = this.unprocessedOpenedNotifs;
            Intrinsics.checkNotNullParameter(c6202qj, "<this>");
            if (c6202qj != null ? !c6202qj.isEmpty() : c6202qj.iterator().hasNext()) {
                Iterator<JSONArray> it = this.unprocessedOpenedNotifs.iterator();
                while (it.hasNext()) {
                    this.extOpenedCallback.fireOnMain(new a(C6913u61.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(it.next(), this._time)));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void addExternalForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1716Ot0
    @Nullable
    public Object canOpenNotification(@NotNull Activity activity, @NotNull JSONObject jSONObject, @NotNull JM<? super Boolean> jm) {
        b bVar;
        C2512Yo1 c2512Yo1;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object obj = bVar.result;
        MN mn = MN.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            c2512Yo2.d = true;
            C1961Rx<InterfaceC1557Mt0> c1961Rx = this.intLifecycleCallback;
            c cVar = new c(c2512Yo2, activity, jSONObject, null);
            bVar.L$0 = c2512Yo2;
            bVar.label = 1;
            if (c1961Rx.suspendingFire(cVar, bVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) bVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1716Ot0
    @Nullable
    public Object canReceiveNotification(@NotNull JSONObject jSONObject, @NotNull JM<? super Boolean> jm) {
        d dVar;
        C2512Yo1 c2512Yo1;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i3 = dVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            c2512Yo2.d = true;
            C1961Rx<InterfaceC1557Mt0> c1961Rx = this.intLifecycleCallback;
            e eVar = new e(c2512Yo2, jSONObject, null);
            dVar.L$0 = c2512Yo2;
            dVar.label = 1;
            if (c1961Rx.suspendingFire(eVar, dVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) dVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void externalNotificationWillShowInForeground(@NotNull InterfaceC3041bu0 willDisplayEvent) {
        Intrinsics.checkNotNullParameter(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new f(willDisplayEvent));
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void externalRemoteNotificationReceived(@NotNull INotificationReceivedEvent notificationReceivedEvent) {
        Intrinsics.checkNotNullParameter(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new g(notificationReceivedEvent));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1716Ot0
    @Nullable
    public Object notificationOpened(@NotNull Activity activity, @NotNull JSONArray jSONArray, @NotNull JM<? super Unit> jm) throws JSONException {
        h hVar;
        C7333w61 c7333w61;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        Object obj = hVar.result;
        MN mn = MN.d;
        int i3 = hVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            String appId = this._configModelStore.getModel().getAppId();
            if (appId == null) {
                appId = "";
            }
            String str = appId;
            String id = this._subscriptionManager.getSubscriptions().getPush().getId();
            InterfaceC7494ws0.a deviceType = this._deviceService.getDeviceType();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                String oSNotificationIdFromJson = C6074q61.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i4));
                if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                    this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                    G71.INSTANCE.execute(new i(str, oSNotificationIdFromJson, id, deviceType, null));
                }
            }
            C6913u61 c6913u61 = C6913u61.INSTANCE;
            C3084c61 c3084c61GenerateNotificationOpenedResult$com_onesignal_notifications = c6913u61.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
            InterfaceC2178Ur0 interfaceC2178Ur0 = this._analyticsTracker;
            String notificationId = c3084c61GenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            Intrinsics.checkNotNull(notificationId);
            interfaceC2178Ur0.trackOpenedEvent(notificationId, c6913u61.getCampaignNameFromNotification(c3084c61GenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
            String latestNotificationId = getLatestNotificationId(jSONArray);
            if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                this._applicationService.setEntryState(EnumC0894Eg.NOTIFICATION_CLICK);
                if (latestNotificationId != null) {
                    this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                }
            }
            hVar.L$0 = this;
            hVar.L$1 = jSONArray;
            hVar.label = 1;
            if (openDestinationActivity(activity, jSONArray, hVar) == mn) {
                return mn;
            }
            c7333w61 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) hVar.L$1;
            c7333w61 = (C7333w61) hVar.L$0;
            C1795Pt1.b(obj);
        }
        if (c7333w61.extOpenedCallback.getHasSubscribers()) {
            c7333w61.extOpenedCallback.fireOnMain(new j(C6913u61.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, c7333w61._time)));
        } else {
            c7333w61.unprocessedOpenedNotifs.addLast(jSONArray);
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1716Ot0
    @Nullable
    public Object notificationReceived(@NotNull C6283r61 c6283r61, @NotNull JM<? super Unit> jm) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(c6283r61.getApiNotificationId());
        this._influenceManager.onNotificationReceived(c6283r61.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(c6283r61.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", c6283r61.getAndroidId());
            C6913u61 c6913u61 = C6913u61.INSTANCE;
            C3084c61 c3084c61GenerateNotificationOpenedResult$com_onesignal_notifications = c6913u61.generateNotificationOpenedResult$com_onesignal_notifications(KD0.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            InterfaceC2178Ur0 interfaceC2178Ur0 = this._analyticsTracker;
            String notificationId = c3084c61GenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            Intrinsics.checkNotNull(notificationId);
            interfaceC2178Ur0.trackReceivedEvent(notificationId, c6913u61.getCampaignNameFromNotification(c3084c61GenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC0778Ct0
    @Nullable
    public Object openDestinationActivity(@NotNull Activity activity, @NotNull JSONArray jSONArray, @NotNull JM<? super Unit> jm) {
        try {
            JSONObject firstPayloadItem = jSONArray.getJSONObject(0);
            C7467wk0 c7467wk0 = C7467wk0.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(firstPayloadItem, "firstPayloadItem");
            Intent intentVisible = c7467wk0.create(activity, firstPayloadItem).getIntentVisible();
            if (intentVisible != null) {
                NS0.info$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                activity.startActivity(intentVisible);
            } else {
                NS0.info$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void removeExternalClickListener(@NotNull InterfaceC1090Gt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void removeExternalForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // defpackage.InterfaceC1716Ot0
    public void setInternalNotificationLifecycleCallback(@Nullable InterfaceC1557Mt0 callback) {
        this.intLifecycleCallback.set(callback);
    }

    public final void setupNotificationServiceExtension(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            NS0.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        NS0.verbose$default(C1039Gc0.d("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Object objNewInstance = Class.forName(manifestMeta).newInstance();
            if (!(objNewInstance instanceof InterfaceC2526Yt0) || this.extRemoteReceivedCallback.getHasCallback()) {
                return;
            }
            this.extRemoteReceivedCallback.set((InterfaceC2526Yt0) objNewInstance);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        }
    }
}
