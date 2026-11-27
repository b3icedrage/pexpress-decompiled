package io.sentry.android.replay.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.ConnectionResult;
import defpackage.EF0;
import defpackage.SK;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
public final class a {

    @NotNull
    public final File a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(File file, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter("video/avc", "mimeType");
        this.a = file;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.e) + EF0.a(this.d, EF0.a(this.c, EF0.a(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31) + 1331836730;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MuxerConfig(file=");
        sb.append(this.a);
        sb.append(", recordingWidth=");
        sb.append(this.b);
        sb.append(", recordingHeight=");
        sb.append(this.c);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", bitRate=");
        return SK.b(sb, this.e, ", mimeType=video/avc)");
    }
}
