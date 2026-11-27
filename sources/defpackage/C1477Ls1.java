package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ls1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR4\u0010&\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0$j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"LLs1;", "LCu0;", "LWr0;", "_application", "<init>", "(LWr0;)V", "", "permissionType", "LCu0$a;", "callback", "", "registerAsCallback", "(Ljava/lang/String;LCu0$a;)V", "getCallback", "(Ljava/lang/String;)LCu0$a;", "", "fallbackCondition", "permissionRequestType", "androidPermissionString", "Ljava/lang/Class;", "callbackClass", "startPrompt", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "LWr0;", "waiting", "Z", "getWaiting", "()Z", "setWaiting", "(Z)V", "fallbackToSettings", "getFallbackToSettings", "setFallbackToSettings", "shouldShowRequestPermissionRationaleBeforeRequest", "getShouldShowRequestPermissionRationaleBeforeRequest", "setShouldShowRequestPermissionRationaleBeforeRequest", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "callbackMap", "Ljava/util/HashMap;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1477Ls1 implements InterfaceC0781Cu0 {

    @NotNull
    private final InterfaceC2338Wr0 _application;

    @NotNull
    private final HashMap<String, InterfaceC0781Cu0.a> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* JADX INFO: renamed from: Ls1$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls1$a", "LTr0;", "Landroid/app/Activity;", "activity", "", "onActivityAvailable", "(Landroid/app/Activity;)V", "onActivityStopped", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a implements InterfaceC2100Tr0 {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // defpackage.InterfaceC2100Tr0
        public void onActivityAvailable(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                C1477Ls1.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(C1223Il1.onesignal_fade_in, C1223Il1.onesignal_fade_out);
        }

        @Override // defpackage.InterfaceC2100Tr0
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public C1477Ls1(@NotNull InterfaceC2338Wr0 _application) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        this._application = _application;
        this.callbackMap = new HashMap<>();
    }

    @Nullable
    public final InterfaceC0781Cu0.a getCallback(@NotNull String permissionType) {
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        return this.callbackMap.get(permissionType);
    }

    public final boolean getFallbackToSettings() {
        return this.fallbackToSettings;
    }

    public final boolean getShouldShowRequestPermissionRationaleBeforeRequest() {
        return this.shouldShowRequestPermissionRationaleBeforeRequest;
    }

    public final boolean getWaiting() {
        return this.waiting;
    }

    @Override // defpackage.InterfaceC0781Cu0
    public void registerAsCallback(@NotNull String permissionType, @NotNull InterfaceC0781Cu0.a callback) {
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbackMap.put(permissionType, callback);
    }

    public final void setFallbackToSettings(boolean z) {
        this.fallbackToSettings = z;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z;
    }

    public final void setWaiting(boolean z) {
        this.waiting = z;
    }

    @Override // defpackage.InterfaceC0781Cu0
    public void startPrompt(boolean fallbackCondition, @Nullable String permissionRequestType, @Nullable String androidPermissionString, @NotNull Class<?> callbackClass) {
        Intrinsics.checkNotNullParameter(callbackClass, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = fallbackCondition;
        this._application.addActivityLifecycleHandler(new a(permissionRequestType, androidPermissionString, callbackClass));
    }
}
