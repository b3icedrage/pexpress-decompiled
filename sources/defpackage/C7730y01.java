package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0014\u0010$\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Ly01;", "Lcu0;", "<init>", "()V", "", "fallbackToSettings", "", "requestPermission", "(ZLJM;)Ljava/lang/Object;", "", "id", "removeNotification", "(I)Ljava/lang/Void;", "", "group", "removeGroupedNotifications", "(Ljava/lang/String;)Ljava/lang/Void;", "clearAllNotifications", "()Ljava/lang/Void;", "Lqu0;", "observer", "addPermissionObserver", "(Lqu0;)Ljava/lang/Void;", "removePermissionObserver", "LNt0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addForegroundLifecycleListener", "(LNt0;)Ljava/lang/Void;", "removeForegroundLifecycleListener", "LGt0;", "addClickListener", "(LGt0;)Ljava/lang/Void;", "removeClickListener", "getPermission", "permission", "getCanRequestPermission", "canRequestPermission", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7730y01 implements InterfaceC3250cu0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y01$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ly01$a;", "", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getEXCEPTION", "()Ljava/lang/Exception;", "EXCEPTION", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private Companion() {
        }
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo32getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo33getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // defpackage.InterfaceC3250cu0
    @Nullable
    public Object requestPermission(boolean z, @NotNull JM<?> jm) throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo28addClickListener(@NotNull InterfaceC1090Gt0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo29addForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo30addPermissionObserver(@NotNull InterfaceC6240qu0 observer) throws Exception {
        Intrinsics.checkNotNullParameter(observer, "observer");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo31clearAllNotifications() throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @NotNull
    public Void getCanRequestPermission() throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @NotNull
    public Void getPermission() throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo34removeClickListener(@NotNull InterfaceC1090Gt0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo35removeForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo36removeGroupedNotifications(@NotNull String group) throws Exception {
        Intrinsics.checkNotNullParameter(group, "group");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo37removeNotification(int id) throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC3250cu0
    @NotNull
    /* JADX INFO: renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo38removePermissionObserver(@NotNull InterfaceC6240qu0 observer) throws Exception {
        Intrinsics.checkNotNullParameter(observer, "observer");
        throw INSTANCE.getEXCEPTION();
    }
}
