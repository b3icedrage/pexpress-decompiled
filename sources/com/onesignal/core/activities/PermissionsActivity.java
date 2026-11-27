package com.onesignal.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import defpackage.C1223Il1;
import defpackage.C1477Ls1;
import defpackage.C5491nL;
import defpackage.C7766y91;
import defpackage.InterfaceC0781Cu0;
import defpackage.InterfaceC6659su0;
import defpackage.R51;
import defpackage.WU;
import defpackage.Y6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/onesignal/core/activities/PermissionsActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "extras", "", "handleBundleParams", "(Landroid/os/Bundle;)V", "reregisterCallbackHandlers", "", "androidPermissionString", "requestPermission", "(Ljava/lang/String;)V", "permission", "", "shouldShowSettings", "(Ljava/lang/String;)Z", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "LLs1;", "requestPermissionService", "LLs1;", "Lsu0;", "preferenceService", "Lsu0;", "permissionRequestType", "Ljava/lang/String;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PermissionsActivity extends Activity {
    public static final int DELAY_TIME_CALLBACK_CALL = 500;

    @NotNull
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";

    @NotNull
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";

    @NotNull
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;

    @Nullable
    private String permissionRequestType;

    @Nullable
    private InterfaceC6659su0 preferenceService;

    @Nullable
    private C1477Ls1 requestPermissionService;

    private final void handleBundleParams(Bundle extras) {
        reregisterCallbackHandlers(extras);
        Intrinsics.checkNotNull(extras);
        this.permissionRequestType = extras.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = extras.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        Intrinsics.checkNotNull(string);
        requestPermission(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onRequestPermissionsResult$lambda-0, reason: not valid java name */
    public static final void m16onRequestPermissionsResult$lambda0(PermissionsActivity this$0, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(grantResults, "$grantResults");
        C1477Ls1 c1477Ls1 = this$0.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls1);
        String str = this$0.permissionRequestType;
        Intrinsics.checkNotNull(str);
        InterfaceC0781Cu0.a callback = c1477Ls1.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + this$0.permissionRequestType);
        }
        if (permissions.length == 0) {
            callback.onReject(false);
            return;
        }
        String str2 = permissions[0];
        if (grantResults.length <= 0 || grantResults[0] != 0) {
            callback.onReject(this$0.shouldShowSettings(str2));
            return;
        }
        callback.onAccept();
        InterfaceC6659su0 interfaceC6659su0 = this$0.preferenceService;
        Intrinsics.checkNotNull(interfaceC6659su0);
        interfaceC6659su0.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str2, Boolean.TRUE);
    }

    private final void requestPermission(String androidPermissionString) {
        C1477Ls1 c1477Ls1 = this.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls1);
        if (c1477Ls1.getWaiting()) {
            return;
        }
        C1477Ls1 c1477Ls2 = this.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls2);
        c1477Ls2.setWaiting(true);
        C1477Ls1 c1477Ls3 = this.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls3);
        c1477Ls3.setShouldShowRequestPermissionRationaleBeforeRequest(Y6.b(this, androidPermissionString));
        Y6.a(this, new String[]{androidPermissionString}, 2);
    }

    private final void reregisterCallbackHandlers(Bundle extras) {
        Intrinsics.checkNotNull(extras);
        String string = extras.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(C5491nL.c("Could not find callback class for PermissionActivity: ", string));
        }
    }

    private final boolean shouldShowSettings(String permission) {
        C1477Ls1 c1477Ls1 = this.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls1);
        if (!c1477Ls1.getFallbackToSettings()) {
            return false;
        }
        C1477Ls1 c1477Ls2 = this.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls2);
        if (c1477Ls2.getShouldShowRequestPermissionRationaleBeforeRequest() && !Y6.b(this, permission)) {
            InterfaceC6659su0 interfaceC6659su0 = this.preferenceService;
            Intrinsics.checkNotNull(interfaceC6659su0);
            interfaceC6659su0.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + permission, Boolean.TRUE);
            return false;
        }
        InterfaceC6659su0 interfaceC6659su1 = this.preferenceService;
        Intrinsics.checkNotNull(interfaceC6659su1);
        Boolean bool = interfaceC6659su1.getBool("OneSignal", "USER_RESOLVED_PERMISSION_" + permission, Boolean.FALSE);
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (C7766y91.c(this)) {
            this.requestPermissionService = (C1477Ls1) C7766y91.b().getService(C1477Ls1.class);
            this.preferenceService = (InterfaceC6659su0) C7766y91.b().getService(InterfaceC6659su0.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        C1477Ls1 c1477Ls1 = this.requestPermissionService;
        Intrinsics.checkNotNull(c1477Ls1);
        c1477Ls1.setWaiting(false);
        if (requestCode == 2) {
            new Handler().postDelayed(new WU(this, permissions, grantResults, 2), 500L);
        }
        finish();
        overridePendingTransition(C1223Il1.onesignal_fade_in, C1223Il1.onesignal_fade_out);
    }
}
