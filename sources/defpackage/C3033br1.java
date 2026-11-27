package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.a;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: br1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3033br1 {
    public static C2596Zq1 a(a aVar, List<InterfaceC3644em0> list, AbstractC0972Fg abstractC0972Fg) {
        InterfaceC4765jt1 c2531Yv;
        InterfaceC4765jt1 xr1;
        InterfaceC0930Es interfaceC0930Es = aVar.d;
        C2082Tl0 c2082Tl0 = aVar.g;
        Context applicationContext = c2082Tl0.getApplicationContext();
        C2320Wl0 c2320Wl0 = c2082Tl0.h;
        C2596Zq1 c2596Zq1 = new C2596Zq1();
        C6780tV c6780tV = new C6780tV();
        C5616nw0 c5616nw0 = c2596Zq1.g;
        synchronized (c5616nw0) {
            c5616nw0.a.add(c6780tV);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            C5327ma0 c5327ma0 = new C5327ma0();
            C5616nw0 c5616nw1 = c2596Zq1.g;
            synchronized (c5616nw1) {
                c5616nw1.a.add(c5327ma0);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = c2596Zq1.e();
        OU0 ou0 = aVar.h;
        C5615nw c5615nw = new C5615nw(applicationContext, arrayListE, interfaceC0930Es, ou0);
        InterfaceC4765jt1 c7020ud2 = new C7020ud2(interfaceC0930Es, new C7020ud2.g());
        C6900u30 c6900u30 = new C6900u30(c2596Zq1.e(), resources.getDisplayMetrics(), interfaceC0930Es, ou0);
        if (i < 28 || !c2320Wl0.a.containsKey(C1848Ql0.class)) {
            c2531Yv = new C2531Yv(c6900u30);
            xr1 = new XR1(c6900u30, ou0);
        } else {
            xr1 = new HA0();
            c2531Yv = new C2609Zv();
        }
        if (i >= 28) {
            c2596Zq1.d("Animation", InputStream.class, Drawable.class, new C6383rc.c(new C6383rc(arrayListE, ou0)));
            c2596Zq1.d("Animation", ByteBuffer.class, Drawable.class, new C6383rc.b(new C6383rc(arrayListE, ou0)));
        }
        C5185lt1 c5185lt1 = new C5185lt1(applicationContext);
        C7072us c7072us = new C7072us(ou0);
        C6442rs c6442rs = new C6442rs();
        C3787fU c3787fU = new C3787fU();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c2596Zq1.a(ByteBuffer.class, new C1589Ne());
        c2596Zq1.a(InputStream.class, new YK0(ou0));
        c2596Zq1.d("Bitmap", ByteBuffer.class, Bitmap.class, c2531Yv);
        c2596Zq1.d("Bitmap", InputStream.class, Bitmap.class, xr1);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            c2596Zq1.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C3186cc1(c6900u30));
        }
        c2596Zq1.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c7020ud2);
        c2596Zq1.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C7020ud2(interfaceC0930Es, new C7020ud2.c()));
        J01 j01 = I82.a.a;
        c2596Zq1.c(Bitmap.class, Bitmap.class, j01);
        c2596Zq1.d("Bitmap", Bitmap.class, Bitmap.class, new G82());
        c2596Zq1.b(Bitmap.class, c7072us);
        c2596Zq1.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C6652ss(resources, c2531Yv));
        c2596Zq1.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C6652ss(resources, xr1));
        c2596Zq1.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C6652ss(resources, c7020ud2));
        c2596Zq1.b(BitmapDrawable.class, new C6862ts(interfaceC0930Es, c7072us));
        c2596Zq1.d("Animation", InputStream.class, C0988Fl0.class, new YR1(arrayListE, c5615nw, ou0));
        c2596Zq1.d("Animation", ByteBuffer.class, C0988Fl0.class, c5615nw);
        c2596Zq1.b(C0988Fl0.class, new C5027l8());
        c2596Zq1.c(InterfaceC0910El0.class, InterfaceC0910El0.class, j01);
        c2596Zq1.d("Bitmap", InterfaceC0910El0.class, Bitmap.class, new C1378Kl0(interfaceC0930Es));
        c2596Zq1.d("legacy_append", Uri.class, Drawable.class, c5185lt1);
        c2596Zq1.d("legacy_append", Uri.class, Bitmap.class, new C3877ft1(c5185lt1, interfaceC0930Es));
        c2596Zq1.h(new C5825ow.a());
        c2596Zq1.c(File.class, ByteBuffer.class, new C5405mw.b());
        c2596Zq1.c(File.class, InputStream.class, new C1899Rc0.e(new C2055Tc0()));
        c2596Zq1.d("legacy_append", File.class, File.class, new C1429Lc0());
        c2596Zq1.c(File.class, ParcelFileDescriptor.class, new C1899Rc0.b(new C1977Sc0()));
        c2596Zq1.c(File.class, File.class, j01);
        c2596Zq1.h(new c.a(ou0));
        if (!"robolectric".equals(str)) {
            c2596Zq1.h(new ParcelFileDescriptorRewinder.a());
        }
        J01 cVar = new C10.c(applicationContext);
        J01 aVar2 = new C10.a(applicationContext);
        J01 bVar = new C10.b(applicationContext);
        Class cls = Integer.TYPE;
        c2596Zq1.c(cls, InputStream.class, cVar);
        c2596Zq1.c(Integer.class, InputStream.class, cVar);
        c2596Zq1.c(cls, AssetFileDescriptor.class, aVar2);
        c2596Zq1.c(Integer.class, AssetFileDescriptor.class, aVar2);
        c2596Zq1.c(cls, Drawable.class, bVar);
        c2596Zq1.c(Integer.class, Drawable.class, bVar);
        c2596Zq1.c(Uri.class, InputStream.class, new C7287vt1.b(applicationContext));
        c2596Zq1.c(Uri.class, AssetFileDescriptor.class, new C7287vt1.a(applicationContext));
        J01 cVar2 = new C6238qt1.c(resources);
        J01 aVar3 = new C6238qt1.a(resources);
        J01 bVar2 = new C6238qt1.b(resources);
        c2596Zq1.c(Integer.class, Uri.class, cVar2);
        c2596Zq1.c(cls, Uri.class, cVar2);
        c2596Zq1.c(Integer.class, AssetFileDescriptor.class, aVar3);
        c2596Zq1.c(cls, AssetFileDescriptor.class, aVar3);
        c2596Zq1.c(Integer.class, InputStream.class, bVar2);
        c2596Zq1.c(cls, InputStream.class, bVar2);
        c2596Zq1.c(String.class, InputStream.class, new C4414iT.b());
        c2596Zq1.c(Uri.class, InputStream.class, new C4414iT.b());
        c2596Zq1.c(String.class, InputStream.class, new C5514nS1.c());
        c2596Zq1.c(String.class, ParcelFileDescriptor.class, new C5514nS1.b());
        c2596Zq1.c(String.class, AssetFileDescriptor.class, new C5514nS1.a());
        c2596Zq1.c(Uri.class, InputStream.class, new C2573Zj.c(applicationContext.getAssets()));
        c2596Zq1.c(Uri.class, AssetFileDescriptor.class, new C2573Zj.b(applicationContext.getAssets()));
        c2596Zq1.c(Uri.class, InputStream.class, new AY0.a(applicationContext));
        c2596Zq1.c(Uri.class, InputStream.class, new BY0.a(applicationContext));
        if (i >= 29) {
            c2596Zq1.c(Uri.class, InputStream.class, new C7051ul1.c(applicationContext, InputStream.class));
            c2596Zq1.c(Uri.class, ParcelFileDescriptor.class, new C7051ul1.b(applicationContext, ParcelFileDescriptor.class));
        }
        c2596Zq1.c(Uri.class, InputStream.class, new Ja2.d(contentResolver));
        c2596Zq1.c(Uri.class, ParcelFileDescriptor.class, new Ja2.b(contentResolver));
        c2596Zq1.c(Uri.class, AssetFileDescriptor.class, new Ja2.a(contentResolver));
        c2596Zq1.c(Uri.class, InputStream.class, new Oa2.a());
        c2596Zq1.c(URL.class, InputStream.class, new Na2.a());
        c2596Zq1.c(Uri.class, File.class, new C8051zY0.a(applicationContext));
        c2596Zq1.c(C5162lm0.class, InputStream.class, new C0691Bq0.a());
        c2596Zq1.c(byte[].class, ByteBuffer.class, new C2033Sv.a());
        c2596Zq1.c(byte[].class, InputStream.class, new C2033Sv.d());
        c2596Zq1.c(Uri.class, Uri.class, j01);
        c2596Zq1.c(Drawable.class, Drawable.class, j01);
        c2596Zq1.d("legacy_append", Drawable.class, Drawable.class, new H82());
        c2596Zq1.i(Bitmap.class, BitmapDrawable.class, new Nf2(resources));
        c2596Zq1.i(Bitmap.class, byte[].class, c6442rs);
        c2596Zq1.i(Drawable.class, byte[].class, new C7951z30(interfaceC0930Es, c6442rs, c3787fU));
        c2596Zq1.i(C0988Fl0.class, byte[].class, c3787fU);
        InterfaceC4765jt1 c7020ud3 = new C7020ud2(interfaceC0930Es, new C7020ud2.d());
        c2596Zq1.d("legacy_append", ByteBuffer.class, Bitmap.class, c7020ud3);
        c2596Zq1.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C6652ss(resources, c7020ud3));
        for (InterfaceC3644em0 interfaceC3644em0 : list) {
            try {
                interfaceC3644em0.a(applicationContext, aVar, c2596Zq1);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC3644em0.getClass().getName()), e);
            }
        }
        if (abstractC0972Fg != null) {
            abstractC0972Fg.a(applicationContext, aVar, c2596Zq1);
        }
        return c2596Zq1;
    }
}
