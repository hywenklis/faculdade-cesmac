import { ImageBackground } from 'react-native';
import imagemFundo from './../../../assets/imgs/background.png';

export interface BackgroundProps {
}

export function componente(props Background) {
    return (<ImageBackground source={imagemFundo}>
    </ImageBackground>)
}