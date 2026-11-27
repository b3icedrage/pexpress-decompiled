package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: vt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7287vt1<DataT> implements I01<Uri, DataT> {
    public final Context a;
    public final I01<Integer, DataT> b;

    /* JADX INFO: renamed from: vt1$a */
    public static final class a implements J01<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, AssetFileDescriptor> d(@NonNull J11 j11) {
            return new C7287vt1(this.a, j11.a(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: vt1$b */
    public static final class b implements J01<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, InputStream> d(@NonNull J11 j11) {
            return new C7287vt1(this.a, j11.a(Integer.class, InputStream.class));
        }
    }

    public C7287vt1(Context context, I01<Integer, DataT> i01) {
        this.a = context.getApplicationContext();
        this.b = i01;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.a.getPackageName().equals(uri2.getAuthority());
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        I01<Integer, DataT> i01 = this.b;
        if (size == 1) {
            try {
                int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i3 != 0) {
                    return i01.b(Integer.valueOf(i3), i, i2, c4227ha1);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    b0.e("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                    return null;
                }
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    b0.f("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return i01.b(Integer.valueOf(identifier), i, i2, c4227ha1);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                b0.e("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            b0.e("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return null;
    }
}
