package defpackage;

import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.pexpress.tool.R;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4316i {
    public static final C2813ao0 a = new C2813ao0.a().d();

    @Nullable
    public static final String a(@NotNull MimeTypeMap getMimeTypeFromUrl, @Nullable String str) {
        Intrinsics.checkNotNullParameter(getMimeTypeFromUrl, "$this$getMimeTypeFromUrl");
        if (str == null || StringsKt.I(str)) {
            return null;
        }
        String strA0 = StringsKt.a0(StringsKt.a0(str, '#'), '?');
        return getMimeTypeFromUrl.getMimeTypeFromExtension(StringsKt.W(JwtParser.SEPARATOR_CHAR, StringsKt.W('/', strA0, strA0), ""));
    }

    @NotNull
    public static final ViewOnAttachStateChangeListenerC8075ze2 b(@NotNull View requestManager) {
        ViewOnAttachStateChangeListenerC8075ze2 viewOnAttachStateChangeListenerC8075ze2;
        Intrinsics.checkNotNullParameter(requestManager, "$this$requestManager");
        Object tag = requestManager.getTag(R.id.coil_request_manager);
        Object obj = null;
        if (!(tag instanceof ViewOnAttachStateChangeListenerC8075ze2)) {
            tag = null;
        }
        ViewOnAttachStateChangeListenerC8075ze2 viewOnAttachStateChangeListenerC8075ze3 = (ViewOnAttachStateChangeListenerC8075ze2) tag;
        if (viewOnAttachStateChangeListenerC8075ze3 != null) {
            return viewOnAttachStateChangeListenerC8075ze3;
        }
        synchronized (requestManager) {
            Object tag2 = requestManager.getTag(R.id.coil_request_manager);
            if (tag2 instanceof ViewOnAttachStateChangeListenerC8075ze2) {
                obj = tag2;
            }
            viewOnAttachStateChangeListenerC8075ze2 = (ViewOnAttachStateChangeListenerC8075ze2) obj;
            if (viewOnAttachStateChangeListenerC8075ze2 == null) {
                viewOnAttachStateChangeListenerC8075ze2 = new ViewOnAttachStateChangeListenerC8075ze2();
                requestManager.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC8075ze2);
                requestManager.setTag(R.id.coil_request_manager, viewOnAttachStateChangeListenerC8075ze2);
            }
        }
        return viewOnAttachStateChangeListenerC8075ze2;
    }

    @NotNull
    public static final XC1 c(@NotNull ImageView scale) {
        int i;
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        ImageView.ScaleType scaleType = scale.getScaleType();
        return (scaleType != null && ((i = C3896g.a[scaleType.ordinal()]) == 1 || i == 2 || i == 3 || i == 4)) ? XC1.e : XC1.d;
    }

    public static final void d(@NotNull AbstractC5949pX1 metadata) {
        ImageView imageViewE;
        Intrinsics.checkNotNullParameter(metadata, "$this$metadata");
        InterfaceC5739oX1 interfaceC5739oX1C = metadata.c();
        if (!(interfaceC5739oX1C instanceof InterfaceC7234ve2)) {
            interfaceC5739oX1C = null;
        }
        InterfaceC7234ve2 interfaceC7234ve2 = (InterfaceC7234ve2) interfaceC5739oX1C;
        if (interfaceC7234ve2 == null || (imageViewE = interfaceC7234ve2.e()) == null) {
            return;
        }
        b(imageViewE);
    }
}
