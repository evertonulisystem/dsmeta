import icon from '../../assets/img/notification-icon.svg'
import './styles.css'
//mesma pasta é um onto., pastas anteriores .. e as vezes /

function NotificationButton() {
    return (
        <div className="dsmeta-red-btn">
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton