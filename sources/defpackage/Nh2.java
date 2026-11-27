package defpackage;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface Nh2 {
    void a();

    void b(@Nullable PermissionRequest permissionRequest);

    boolean c(@Nullable ValueCallback valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams);

    void d(@Nullable PermissionRequest permissionRequest);
}
