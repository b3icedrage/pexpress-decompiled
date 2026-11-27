package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: Sc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1977Sc0 implements C1899Rc0.d<ParcelFileDescriptor> {
    @Override // defpackage.C1899Rc0.d
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.C1899Rc0.d
    public final void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // defpackage.C1899Rc0.d
    public final ParcelFileDescriptor c(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
