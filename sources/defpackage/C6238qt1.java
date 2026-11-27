package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.io.InputStream;

/* JADX INFO: renamed from: qt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6238qt1<Data> implements I01<Integer, Data> {
    public final I01<Uri, Data> a;
    public final Resources b;

    /* JADX INFO: renamed from: qt1$a */
    public static final class a implements J01<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.J01
        public final I01<Integer, AssetFileDescriptor> d(J11 j11) {
            return new C6238qt1(this.a, j11.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: qt1$b */
    public static class b implements J01<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Integer, InputStream> d(J11 j11) {
            return new C6238qt1(this.a, j11.a(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: qt1$c */
    public static class c implements J01<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Integer, Uri> d(J11 j11) {
            return new C6238qt1(this.a, I82.a);
        }
    }

    public C6238qt1(Resources resources, I01<Uri, Data> i01) {
        this.b = resources;
        this.a = i01;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Integer num) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull Integer num, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                b0.f("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.b(uri, i, i2, c4227ha1);
    }
}
