package defpackage;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382dY1 extends AbstractC6626sk0<C3172cY1> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3382dY1(@NotNull C6102qE1 context, @NotNull InterfaceC5889pD1 schedulers) {
        super(context, schedulers);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
    }

    @Override // defpackage.AbstractC6626sk0
    public final void b() throws IOException {
        C6102qE1 c6102qE1 = this.a;
        String[] list = c6102qE1.a.getAssets().list("notifications");
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.length);
        int i = 0;
        for (String str : list) {
            arrayList.add("notifications/" + str);
        }
        Context context = c6102qE1.a;
        File file = new File(context.getFilesDir(), "notifications");
        if (!file.exists() && file.mkdirs()) {
            C6104qF0.e("Create directory for notifications sounds");
        }
        int length = list.length;
        int i2 = 0;
        while (i < length) {
            String str2 = list[i];
            int i3 = i2 + 1;
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(FileProvider.c(context, context.getPackageName() + ".jivosdk.fileprovider").b(new File(file, str2)));
                if (outputStreamOpenOutputStream != null) {
                    try {
                        InputStream inputStreamOpen = context.getAssets().open((String) arrayList.get(i2));
                        try {
                            byte[] bArr = new byte[inputStreamOpen.available()];
                            inputStreamOpen.read(bArr);
                            outputStreamOpenOutputStream.write(bArr);
                            outputStreamOpenOutputStream.flush();
                            C4201hS c4201hS = C6104qF0.a;
                            C6104qF0.e("Notification sound \"" + str2 + "\" successfully copied to files dir");
                            Unit unit = Unit.a;
                            inputStreamOpen.close();
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C6621sj.b(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            C6621sj.b(outputStreamOpenOutputStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    continue;
                }
            } catch (Exception unused) {
                C4201hS c4201hS2 = C6104qF0.a;
                C6104qF0.b("Can not save sound \"" + str2 + '\"');
            }
            i++;
            i2 = i3;
        }
    }
}
