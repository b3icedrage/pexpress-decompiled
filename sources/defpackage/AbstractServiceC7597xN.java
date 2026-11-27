package defpackage;

import android.app.Service;
import android.os.Binder;
import com.base.app.services.WebSocketService;
import kotlin.Metadata;

/* JADX INFO: renamed from: xN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LxN;", "Landroid/app/Service;", "<init>", "()V", R51.PUSH_ADDITIONAL_DATA_KEY, "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractServiceC7597xN extends Service {

    /* JADX INFO: renamed from: xN$a */
    public final class a extends Binder {
        public final /* synthetic */ WebSocketService b;

        public a(WebSocketService webSocketService) {
            this.b = webSocketService;
        }
    }
}
