package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5071lM implements InterfaceC5122lc0<Uri> {
    public final Context a;

    public C5071lM(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final boolean a(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.a(data.getScheme(), "content");
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "data.toString()");
        return string;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final Object c(C2509Yn1 c2509Yn1, Object obj, LM1 lm1, C4695ja1 c4695ja1, S60 s60) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        Uri data = (Uri) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zA = Intrinsics.a(data.getAuthority(), "com.android.contacts");
        Context context = this.a;
        if (zA && Intrinsics.a(data.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(data, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + data + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(data);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + data + "'.").toString());
            }
        }
        return new ZN1(Cm2.e(Cm2.q(inputStreamOpenInputStream)), context.getContentResolver().getType(data), DS.g);
    }
}
